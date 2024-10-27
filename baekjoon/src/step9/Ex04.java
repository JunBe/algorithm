package step9;

import java.util.Scanner;
//1978 소수 찾기
public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int[] numArr = new int[N];
        for (int i = 0; i < N; i++) {
            numArr[i] = sc.nextInt();
            if (isPrime(numArr[i])) {
                count++;
            }
        }
        System.out.println(count);

    }

    private static boolean isPrime(int num) {
        int total = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                total++;
            }
        }

        if (total == 1) {
            return true;
        }
        return false;
    }
}
