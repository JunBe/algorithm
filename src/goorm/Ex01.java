package goorm;

import java.util.Scanner;

//합 계산기
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //식의 개수
        int num1, num2; //정수 1,2
        String op; //연산자

        int total = 0; //계산식들의 합
        for (int i = 0; i < T; i++) {
            int sum=0; // 한 계산식의 답
            num1=sc.nextInt();
            op = sc.next();
            num2 = sc.nextInt();

            if(op.equals("+")){
                sum = num1 + num2;
            } else if (op.equals("-")) {
                sum = num1 - num2;
            } else if (op.equals("*")) {
                sum = num1 * num2;
            } else if (op.equals("/")) {
                sum = num1 / num2;
            }
            total += sum;
        }
        System.out.println(total);

    }
}
