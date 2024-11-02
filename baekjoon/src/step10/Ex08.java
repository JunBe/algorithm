package step10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//14215 세 막대
public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());

        if (arr[0] < arr[1] + arr[2]) {
            System.out.println(arr[0] + arr[1] + arr[2]);
        } else {
            System.out.println((arr[1] + arr[2]) * 2 - 1);
        }

    }
}
