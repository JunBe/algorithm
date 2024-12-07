package step13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//25305 커트라인
public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.get(k - 1));
    }
}
