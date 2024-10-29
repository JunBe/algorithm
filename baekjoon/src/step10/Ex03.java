package step10;

import java.util.Scanner;

//3009 네 번째 점
public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] point = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                point[i][j] = sc.nextInt();
            }
        }

        int checkX = point[0][0];
        int saveX = 0;
        int count = 0;
        for (int i = 1; i < 3; i++) {
            if (checkX == point[i][0]) {
                count++;
            }else {
                saveX = point[i][0];
            }
        }
        if (count == 0) {
            System.out.print(checkX + " ");
        } else {
            System.out.print(saveX+" ");
        }

        int checkY = point[0][1];
        int saveY = 0;
        count = 0;
        for (int i = 1; i < 3; i++) {
            if (checkY == point[i][1]) {
                count++;
            }else {
                saveY = point[i][1];
            }
        }

        if (count == 0) {
            System.out.print(checkY + " ");
        } else {
            System.out.print(saveY+" ");
        }
    }
}
