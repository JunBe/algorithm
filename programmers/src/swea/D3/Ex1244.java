package swea.D3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex1244 {

    public static int[] solution(int num, int changeNum) {
        int size = 0;
        int sizeNum = num;
        while (sizeNum > 0) {
            size++;
            sizeNum = sizeNum / 10;
        }
//        System.out.println("size = " + size);

        int[] arr = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            arr[i] = num % 10;
            num = num / 10;
        }

        // arr = 3 2 8 8 8
//        System.out.print("arr = ");
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }

        List<Integer> list = new ArrayList<>();
//        for (int repeat = 0; repeat < changeNum; repeat++) {
            for (int i = 0; i < changeNum; i++) {
                int now = arr[i];
                int max = now;
                int pos = 0;
                for (int j = i + 1; j < size; j++) {
                    if (now < arr[j]) {
                        max = Math.max(max, arr[j]);
                        pos = j;
                    }
                }
                // 교환
                arr[i] = max;
                arr[pos] = 0;
                list.add(now);
            }
//        }


//        System.out.println("list = " + list);

        Collections.sort(list);
        int j = 0;
        for (int i = size - 1; i >= size - list.size(); i--) {
            arr[i] = list.get(j);
            j++;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int num = sc.nextInt();
            int changeCount = sc.nextInt();

            System.out.print("#" + i + " ");
            int[] arr = solution(num, changeCount);
            for (int val : arr) {
                System.out.print(val);
            }

            System.out.println();
        }
    }
}
