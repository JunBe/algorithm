package step11;

import java.util.Scanner;

//24266 알고리즘 수업 - 알고리즘의 수행 시간 6
public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.println(n * (n - 1) * (n - 2) / 6);
        System.out.println(3);
    }
}
