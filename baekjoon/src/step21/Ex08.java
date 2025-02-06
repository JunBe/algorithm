package step21;

import java.util.Scanner;

//2579 계단 오르기
public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] dp = new int[N];
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                dp[i] = arr[0];
            } else if (i == 1) {
                dp[i] = arr[i - 1] + arr[i];
            } else if (i == 2) {
                dp[i] = Math.max(arr[i - 2] + arr[i], arr[i - 1] + arr[i]);
            } else {
                dp[i] = Math.max(dp[i - 3] + arr[i - 1] + arr[i], dp[i - 2] + arr[i]);
            }
        }

        System.out.println(dp[N - 1]);
    }
}
