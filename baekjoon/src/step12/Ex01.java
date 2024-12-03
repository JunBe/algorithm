package step12;

import java.util.Arrays;
import java.util.Scanner;

//2798 블랙잭
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    sum = cards[i] + cards[j] + cards[k];
                    if (sum <= M) {
                        min = Math.min(M - sum, min);
                    }
                }
            }
        }
        System.out.println(M - min);
    }
}
