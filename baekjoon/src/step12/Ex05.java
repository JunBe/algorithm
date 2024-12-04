package step12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//1436 영화감독 숌
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int current = 0;
        int i = 0;
        while (true) {
            i++;
            if (calculate(i)) {
                current++;
            }
            if (N == current) {
                System.out.println(i);
                break;
            }
        }
    }

    private static boolean calculate(int n) {
        List<Integer> list = new ArrayList<>();
        while (n > 0) { // 66616 66626등 어디감
            list.add(n % 10);
            n = n / 10;
        }
        int equalCount = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 6) {
                if (equalCount > 0) {
                    if (list.get(i).equals(list.get(i - 1))) {
                        equalCount++;
                    } else {
                        equalCount = 0;
                    }
                } else {
                    equalCount++;
                }
            }else{
                equalCount = 0;
            }
            if (equalCount == 3) {
                return true;
            }
        }
        return false;
    }
}
