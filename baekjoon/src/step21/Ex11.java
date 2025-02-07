package step21;

import java.util.Scanner;

//2156 포도주 시식
public class Ex11 {
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
                dp[i] = Math.max(Math.max(arr[i - 1] + arr[i], arr[i - 2] + arr[i]), arr[i - 2] + arr[i - 1]);
            } else {
                dp[i] = Math.max(Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]), dp[i - 1]);
            }
        }

        System.out.println(dp[N - 1]);

    }
}
