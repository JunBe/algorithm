package step15;

import java.util.Scanner;

//1735 분수 합
public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][2];

        for (int i = 0; i < 2; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int up = arr[0][0] * arr[1][1] + arr[0][1] * arr[1][0];
        int down = arr[0][1] * arr[1][1];

        int max = Math.max(up, down);
        int min = Math.min(up, down);

        boolean checkUp = false;
        if (up > down) {
            checkUp = true;
        }

        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 2; i <= min; i++) {
                if (max % i == 0 && min % i == 0) {
                    max = max / i;
                    min = min / i;
                    flag = false;
                    break;
                }
            }
        }

        if (checkUp) {
            System.out.println(max + " " + min);
        } else {
            System.out.println(min + " " + max);
        }



    }
}
