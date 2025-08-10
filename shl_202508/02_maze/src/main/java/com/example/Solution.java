package com.example;
import java.util.*;

/*
 * The input consists of an integer- num, representing the car registration number.
 */
public class Solution {
    /**
     * 判断老鼠能否从(0,0)走到奶酪(9)位置
     * @param maze 迷宫矩阵
     * @return 能到达返回1，否则返回0
     */
    public static int canReachCheese(int[][] maze) {
        // 边界与空输入保护
        if (maze == null || maze.length == 0 || maze[0] == null || maze[0].length == 0) {
            return 0;
        }
        int n = maze.length;
        int m = maze[0].length;
        // 起点必须可走
        if (!(maze[0][0] == 1 || maze[0][0] == 9)) return 0;
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0], y = curr[1];
            if (visited[x][y]) continue;
            visited[x][y] = true;
            if (maze[x][y] == 9) return 1;
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d], ny = y + dy[d];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (!visited[nx][ny] && (maze[nx][ny] == 1 || maze[nx][ny] == 9)) {
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
        }
        return 0;
    }

    /**
     * 读取输入并输出结果（用于OJ）
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] maze = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    maze[i][j] = sc.nextInt();
                }
            }
            System.out.println(canReachCheese(maze));
        }
    }
}
