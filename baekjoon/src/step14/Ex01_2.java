package step14;

import java.io.*;
import java.util.*;

//10815 숫자 카드
public class Ex01_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<Integer,Boolean> myCard = new HashMap<>();
        List<Integer> answerNumber = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());
        String[] splitN = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            myCard.put(Integer.parseInt(splitN[i]), true);
        }

        int M = Integer.parseInt(br.readLine());
        String[] splitM = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            answerNumber.add(Integer.parseInt(splitM[i]));
        }

        for (Integer number : answerNumber) {
            if (myCard.containsKey(number)) {
                bw.write(1 + " ");
            } else {
                bw.write(0 + " ");
            }
        }

        bw.flush();
        bw.close();
    }

}
