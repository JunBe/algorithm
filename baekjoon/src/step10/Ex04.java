package step10;

import java.util.Scanner;
//15894 수학은 체육과목 입니다
public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long total = 0;
        for (int i = 1; i <= n; i++) {
            total += 3;
        }
        total += n;
        System.out.println(total);
    }
}
