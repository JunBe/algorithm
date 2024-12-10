package step13;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//1427 소트인사이드
public class Ex06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        List<Integer> list = new ArrayList<>();

        for (char val : input.toCharArray()) {
            list.add(val - 48);
        }

        list.sort(Collections.reverseOrder());

        for (int val : list) {
            bw.write(val + "");
        }

        bw.flush();
        bw.close();
    }
}
