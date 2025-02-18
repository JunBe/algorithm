package step21;

import java.util.Scanner;

//9251 LCS
public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int len1 = str1.length();
        int len2 = str2.length();

        int[][] dp = new int[len1][len2];

        if(str1.charAt(0) == str2.charAt(0)){
            dp[0][0] = 1;
        }

        for (int i = 1; i < len1; i++) {
            if (str2.charAt(0) == str1.charAt(i)) { //a
                dp[i][0] = 1;
            } else {
                dp[i][0] = Math.max(dp[i][0], dp[i - 1][0]);
            }
        }

        for (int i = 1; i < len2; i++) {
            if (str1.charAt(0) == str2.charAt(i)) { //c
                dp[0][i] = 1;
            } else {
                dp[0][i] = Math.max(dp[0][i], dp[0][i - 1]);
            }
        }


        for (int i = 1; i < len1; i++) {
            char a = str1.charAt(i); //c

            for (int j = 1; j < len2; j++) {
                if (a == str2.charAt(j)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        System.out.println(dp[len1 - 1][len2 - 1]);
    }
}
