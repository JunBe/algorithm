package step10;

import java.util.Scanner;

//9063 대지
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int xMin = Integer.MAX_VALUE;
        int xMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i][0] < xMin) {
                xMin = arr[i][0];
            }
            if (arr[i][0] > xMax) {
                xMax = arr[i][0];
            }
            if (arr[i][1] < yMin) {
                yMin = arr[i][1];
            }
            if (arr[i][1] > yMax) {
                yMax = arr[i][1];
            }
        }
        int area = (xMax - xMin) * (yMax - yMin);
        System.out.println(area);
    }
}
