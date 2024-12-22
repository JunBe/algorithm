package step14;

import java.util.*;

//7785 회사에 있는 사람
public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String, String> workingLog = new HashMap<>();

        for (int i = 0; i < n; i++) {
            workingLog.put(sc.next(), sc.next());
        }

        List<String> worker = new ArrayList<>();
        for (String key : workingLog.keySet()) {
            if (workingLog.get(key).equals("enter")) {
                worker.add(key);
            }
        }
        worker.sort(Comparator.reverseOrder());
        for (String name : worker) {
            System.out.println(name);
        }
    }
}
