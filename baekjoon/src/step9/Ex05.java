package step9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2581 소수
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        if (list.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(getSum(list)); // 합
            System.out.println(list.get(0));
        }

    }

    private static int getSum(List<Integer> list) {
        int sum = 0;
        for (Integer val : list) {
            sum += val;
        }
        return sum;
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
