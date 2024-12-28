package step15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2485 가로수
public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        List<Long> list = new ArrayList<>();
        for (int i = 0; i < N - 1; i++) {
            list.add(arr[i + 1] - arr[i]);
        }

        List<Long> minList = new ArrayList<>();
        for (int i = 0; i < N - 2; i++) {
            long gcd = gcd(list.get(0), list.get(i + 1));
            minList.add(gcd);
        }

        long min = Long.MAX_VALUE;
        for (Long val : minList) {
            if (min > val) {
                min = val;
            }
        }

        long count = 0;
        for (Long val : list) {
            long tmp = val / min;
            count += (tmp - 1);
        }

        System.out.println(count);
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}
