package step21;

import java.util.Scanner;

//1932 정수 삼각형
public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[N][N];

        for (int i = N - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (i == N - 1) {
                    dp[i - 1][j] = Math.max(arr[i][j], arr[i][j + 1]) + arr[i - 1][j];
                } else {
                    dp[i - 1][j] = Math.max(dp[i][j], dp[i][j + 1]) + arr[i - 1][j];
                }
            }
        }

        if (N == 1) {
            System.out.println(arr[0][0]);
        } else {
            System.out.println(dp[0][0]);
        }
    }
}
