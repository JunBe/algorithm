package step14;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex07 {
    //1269 대칭 차집합
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A; i++) {
            int input = sc.nextInt();
            map.put(input, map.getOrDefault(input, 0) + 1);
        }

        for (int i = 0; i < B; i++) {
            int input = sc.nextInt();
            map.put(input, map.getOrDefault(input, 0) - 1);
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1 || entry.getValue() == -1) {
                count++;
            }
        }

        System.out.println(count);
    }
}
