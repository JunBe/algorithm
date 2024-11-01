package step10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
//5073 삼각형과 세 변
public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] length = {-1,-1,-1};
        while (true) {
            for (int i = 0; i < length.length; i++) {
                length[i] = sc.nextInt();
            }
            if (length[0] == 0 && length[1] == 0 && length[2] == 0) {
                break;
            }
            Arrays.sort(length, Collections.reverseOrder());

            if (length[0] < length[1] + length[2]) {
                if (length[0].equals(length[1]) && length[1].equals(length[2])) {
                    System.out.println("Equilateral");
                } else if (length[0].equals(length[1]) || length[1].equals(length[2])) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
