package step21;

import java.util.Scanner;
//11054 가장 긴 바이토닉 부분 수열
public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        int[][] dp = new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i][0] = Math.max(dp[i][0], dp[j][0] + 1);
                }
            }
        }

        for (int i = N - 1; i >= 0; i--) {
            for (int k = N-1; k > i; k--) {
                if (arr[k] < arr[i]) {
                    dp[i][1] = Math.max(dp[i][1], dp[k][1] + 1);
                }
            }
        }

        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max, dp[i][0] + dp[i][1] + 1);
        }

        System.out.println(max);
    }
}
