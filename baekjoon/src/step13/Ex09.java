package step13;

import java.util.*;

//1181 단어 정렬
public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.next());
        }

        ComparatorLength comparatorLength = new ComparatorLength();
        Collections.sort(list);
        list.sort(comparatorLength);

        Set<String> set = new LinkedHashSet<>();
        for (String val : list) {
            set.add(val);
        }
        for (String li : set) {
            System.out.println(li + " ");
        }
    }

}

class ComparatorLength implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        }
        return 0;
    }
}

