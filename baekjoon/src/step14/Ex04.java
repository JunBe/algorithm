package step14;

import java.io.*;
import java.util.*;

//1620 나는야 포켓몬 마스터 이다솜
public class Ex04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] split = br.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        Map<String, Integer> pocketmonList = new HashMap<>();
        Map<Integer, String> pocketmonListNumber = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            pocketmonList.put(name, i + 1);
            pocketmonListNumber.put(i + 1, name);
        }

        List<String> question = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            question.add(br.readLine());
        }

        for (String val : question) {
            Boolean flag = true;
            for (char ch : val.toCharArray()) {
                if (Character.isDigit(ch)) {
                    flag = false;
                }
            }

            if (flag) { //문자
                bw.write(pocketmonList.get(val) + "\n");
            } else {
                bw.write(pocketmonListNumber.get(Integer.parseInt(val)) + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
