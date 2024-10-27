package step9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//9506 약수들의 합
public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        List<Integer> list = new ArrayList<>();
        while (true) {
            n = sc.nextInt();
            if (n == -1) break;

            addList(n, list);
            printResult(n, list);

            list.clear();
        }
    }

    private static void printResult(int n, List<Integer> list) {
        int total = getSumVal(list);

        if (total == n) {
            System.out.print(n + " = ");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
                if (i != list.size() - 1) {
                    System.out.print(" + ");
                }
            }
            System.out.println();
        } else {
            System.out.println(n + " is NOT perfect.");
        }
    }

    private static int getSumVal(List<Integer> list) {
        int total = 0;
        for (Integer val : list) {
            total += val;
        }
        return total;
    }

    private static void addList(int n, List<Integer> list) {
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
    }
}
