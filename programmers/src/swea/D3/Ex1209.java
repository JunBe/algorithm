package swea.D3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex1209 {
    public static int solution(int T, int[][] arr) {
        List<Integer> list = new ArrayList<>();
        int sum1;
        int sum2;
        int sum3 = 0;
        int sum4 = 0;
        for (int i = 0; i < 100; i++) {
            sum1 = 0;
            sum2 = 0;
            for (int j = 0; j < 100; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];

                if (i == j) {
                    sum3 += arr[i][j];
                }

                if (i + j == 99) {
                    sum4 += arr[i][j];
                }
            }
            list.add(sum1);
            list.add(sum2);
        }
        list.add(sum3);
        list.add(sum4);

        list.sort(Collections.reverseOrder());
        return list.getFirst();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[100][100];

        for (int i = 0; i < 10; i++) {
            int T = sc.nextInt();
            for (int row = 0; row < 100; row++) {
                for (int col = 0; col < 100; col++) {
                    arr[row][col] = sc.nextInt();
                }
            }

            System.out.println("#" + T + " " + solution(T, arr));
        }
    }
}
