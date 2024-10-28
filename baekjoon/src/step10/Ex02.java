package step10;

import java.util.Scanner;
//1085 직사각형에서 탈출
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int minWidth = Math.min(x, w - x);
        int minHeight = Math.min(y, h - y);

        int ans = Math.min(minWidth, minHeight);
        System.out.println(ans);
    }
}
