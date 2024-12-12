package step13;

import java.util.*;

public class Ex10 {
    //10814 나이순 정렬
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, List<String>> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            List<String> list = map.getOrDefault(age, new ArrayList<>());
            list.add(name);
            map.put(age, list);
        }

        List<Integer> keySort = new ArrayList<>();
        for (Integer key : map.keySet()) {
            keySort.add(key);
        }
        Collections.sort(keySort);


        for (Integer key : keySort) {
            for (String val : map.get(key)) {
                System.out.println(key + " " + val);
            }
        }
    }
}
