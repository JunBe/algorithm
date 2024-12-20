package step14;

import java.io.*;
import java.util.*;

//14425 문자열 집합
public class Ex02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputNM = br.readLine().split(" ");
        int N = Integer.parseInt(inputNM[0]);
        int M = Integer.parseInt(inputNM[1]);

        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        for (int i = 0; i < M; i++) {
            list.add(br.readLine());
        }

        int count = 0;
        for (String val : list) {
            if (set.contains(val)) {
                count++;
            }
        }


        bw.write(count + "");

        bw.flush();
        bw.close();


    }
}
