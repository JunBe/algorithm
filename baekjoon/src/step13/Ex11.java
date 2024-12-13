package step13;

import java.io.*;
import java.util.*;

//18870 좌표 압축
public class Ex11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        List<Integer> beforeList = new ArrayList<>();
        List<Integer> afterList = new ArrayList<>();

        String[] split = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            beforeList.add(Integer.parseInt(split[i])); // n
        }
        //2 4 -9 -10 4
        //-10 -9 2 4
        Set<Integer> setList = new HashSet<>(beforeList);
        List<Integer> sortedList = new ArrayList<>(setList);
        Collections.sort(sortedList);
        for (int i = 0; i < N; i++) {
            int find = beforeList.get(i);
            int index = findIndex(0, sortedList.size() - 1, find, sortedList);
            afterList.add(index);
        }
        for (Integer val : afterList) {
            bw.write(val + " ");
        }

        bw.flush();
        bw.close();
    }

    private static int findIndex(int low, int high, int findValue, List<Integer> sortedList) {
        int mid = (low + high) / 2;
        if (findValue > sortedList.get(mid)) {
            low = mid + 1;
            return findIndex(low, high, findValue, sortedList);
        } else if (findValue < sortedList.get(mid)) {
            high = mid;
            return findIndex(low, high, findValue, sortedList);
        } else {
            return mid;
        }
    }
}
