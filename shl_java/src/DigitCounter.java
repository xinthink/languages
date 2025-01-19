import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取输入数据
        System.out.println("请输入要编码的数据：");
        int data = scanner.nextInt();

        System.out.println("请输入要计数的数字：");
        int digit = scanner.nextInt();

        // 计算特定数字在数据中的出现次数
        int count = countDigit(data, digit);

        // 输出结果
        System.out.println("特定数字在数据中的出现次数为：" + count);
    }

    /**
     * 计算特定数字在数据中的出现次数
     *
     * @param data  要编码的数据
     * @param digit 要计数的数字
     * @return 特定数字在数据中的出现次数
     */
    public static int countDigit(int data, int digit) {
        int count = 0;
        data = Math.abs(data);
        while (data > 0) {
            if (data % 10 == digit) {
                count++;
            }
            data /= 10;
        }
        return count;
    }
}
