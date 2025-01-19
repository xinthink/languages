public class MissingCharacter {

    public static void main(String[] args) {
        String stringSent = "abcdfjgerj";
        String stringRec = "abcdfjger";
        char missingCharacter = findMissingCharacter(stringSent, stringRec);
        System.out.println("丢失的字符是: " + missingCharacter);

        stringSent = "aaaabaa";
        stringRec = "aaaaaaa";
        missingCharacter = findMissingCharacter(stringSent, stringRec);
        System.out.println("丢失的字符是: " + missingCharacter);

        stringSent = "aaaabaa";
        stringRec = "aaaaaBaa";
        missingCharacter = findMissingCharacter(stringSent, stringRec);
        System.out.println("丢失的字符是: " + missingCharacter);

        stringSent = "aaaabaa0";
        stringRec = "aaaabaa0";
        missingCharacter = findMissingCharacter(stringSent, stringRec);
        System.out.println("丢失的字符是: " + missingCharacter);

        stringSent = "";
        stringRec = "aaaabaa0";
        missingCharacter = findMissingCharacter(stringSent, stringRec);
        System.out.println("丢失的字符是: " + missingCharacter);

        stringSent = "aaaabaa0";
        stringRec = "";
        missingCharacter = findMissingCharacter(stringSent, stringRec);
        System.out.println("丢失的字符是: " + missingCharacter);
        
        stringSent = "123456";
        stringRec = "123";
        missingCharacter = findMissingCharacter(stringSent, stringRec);
        System.out.println("丢失的字符是: " + missingCharacter);

        stringSent = "123456";
        stringRec = "12345678";
        missingCharacter = findMissingCharacter(stringSent, stringRec);
        System.out.println("丢失的字符是: " + missingCharacter);

        stringSent = "123456";
        stringRec = "1234567";
        missingCharacter = findMissingCharacter(stringSent, stringRec);
        System.out.println("丢失的字符是: " + missingCharacter);
    }

    public static char findMissingCharacter(String stringSent, String stringRec) {
        if (stringSent.equals(stringRec) || stringSent.isEmpty()) {
            return 0;
        }

        int i = 0;
        int lenSent = stringSent.length();
        int lenRec = stringRec.length();

        for (; i < lenSent && i < lenRec; i++) {
            if (stringSent.charAt(i) != stringRec.charAt(i)) {
                return stringSent.charAt(i);
            }
        }

        if (lenSent == lenRec) {
            return 0;
        } else if (lenSent > lenRec) {
            return stringSent.charAt(i);
        } else {
            return stringRec.charAt(i);
        }
    }
}
