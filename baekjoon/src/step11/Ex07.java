package step11;

import java.util.Scanner;

//24313 알고리즘 수업 - 점근적 표기 1
public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f1 = sc.nextInt();
        int f0 = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        if (f1 <= c) {
            if (f1 * n + f0 <= c * n) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println(0);
        }

    }
}
