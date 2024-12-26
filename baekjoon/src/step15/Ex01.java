package step15;

import java.util.Scanner;

//1934 최소공배수
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int tmp = arr[i][1];
            while (arr[i][1] % arr[i][0] != 0) {
                arr[i][1] += tmp;
            }
            System.out.println(arr[i][1]);
        }
    }
}
