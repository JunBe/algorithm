package step9;

import java.util.Scanner;

//11653 소인수분해
public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N > 1) {
            N = calculatePrime(N);
        }
    }

    private static int calculatePrime(int N) {
        for (int i = 2; i <= N; i++) {
            if (N % i == 0) {
                System.out.println(i);
                return N / i;
            }
        }
        return 0;
    }
}
