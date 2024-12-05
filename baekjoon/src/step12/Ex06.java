package step12;

import java.util.Scanner;

//2839 설탕 배달
public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // if 18 -> 5 5 5 3
        // if 17 -> 5 5 5 X -> -1 출력
        int count = 0;
        int sum = 0;
        int countFive = 0;
        while (sum < N) {
            sum += 5;
            count++;
            countFive++;
        } //sum 20 count 4 N 16

        while (true) {
            if (sum < N) { //0
                sum += 3; //4
                count++;
            } else if (sum == N) {
                System.out.println(count);
                return;
            } else {
                sum -= 5;
                count--;
                countFive--;
            }
            if (countFive < 0) {
                System.out.println(-1);
                return;
            }

        }
    }
}
