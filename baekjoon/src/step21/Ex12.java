package step21;

import java.util.Scanner;

//11053 가장 긴 증가하는 부분 수열
public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] dp = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            dp[i] = 1;
        }
        int maxLength = 1;

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]); //3
        }

        System.out.println(maxLength);
    }

    //dp[0] = 1
    //dp[1] = 2
    //dp[2] = 0
    //dp[3] = 1
    //dp[4] = 2
    //dp[5] = 3
    //dp[6] =

}
