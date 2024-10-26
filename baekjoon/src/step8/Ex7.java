package step8;

import java.util.Scanner;

//2869 달팽이는 올라가고 싶다
public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        int count = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0) {
            count++;
        }
        System.out.println(count);
    }
}
