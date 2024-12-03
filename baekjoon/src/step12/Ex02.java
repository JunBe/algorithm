package step12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2231 분해합
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum = i + calculate(i);
            if (N == sum) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }

    private static int calculate(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
