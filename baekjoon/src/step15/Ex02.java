package step15;

import java.util.Scanner;
//13241 최소공배수
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();

        long tmp = A;
        while (A % B != 0) {
            A += tmp;
        }
        System.out.println(A);
    }
}
