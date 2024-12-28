package step15;

import java.util.Scanner;

//1735 분수 합
public class Ex03_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][2];

        for (int i = 0; i < 2; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int up = arr[0][0] * arr[1][1] + arr[0][1] * arr[1][0];
        int down = arr[0][1] * arr[1][1];

        int gcd = gcd(up, down);

        System.out.println(up / gcd + " " + down / gcd);



    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }

        return a;
    }
}
