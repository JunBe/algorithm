package step9;

import java.util.Scanner;

//5086 배수와 약수
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B;
        while (true) {
            A = sc.nextInt();
            B = sc.nextInt();
            if (A == 0 && B == 0) break;
            judge(A, B);
        }
    }

    private static void judge(int A, int B) {
        if (A < B && B % A == 0) {
            System.out.println("factor");
        } else if (A > B && A % B == 0) {
            System.out.println("multiple");
        } else {
            System.out.println("neither");
        }
    }
}
