package step21;

import java.util.Scanner;

//1463 1로 만들기
public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] dp = new int[N + 1];
        dp[1] = 0;

        for (int i = 2; i <= N; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                dp[i] = Math.min(Math.min(dp[i / 2], dp[i / 3]), dp[i - 1]) + 1;
            }

            if (i % 2 == 0) {
                int tmp = Math.min(dp[i / 2], dp[i - 1]) + 1;
                if (dp[i] != 0) {
                    dp[i] = Math.min(tmp, dp[i]);
                } else {
                    dp[i] = tmp;
                }
            }
            if (i % 3 == 0) {
                int tmp = Math.min(dp[i / 3], dp[i - 1]) + 1;
                if (dp[i] != 0) {
                    dp[i] = Math.min(tmp, dp[i]);
                } else {
                    dp[i] = tmp;
                }
            }

            int tmp = dp[i - 1] + 1;
            if (dp[i] != 0) {
                dp[i] = Math.min(tmp, dp[i]);
            } else {
                dp[i] = tmp;
            }
        }

        System.out.println(dp[N]);
    }
}
