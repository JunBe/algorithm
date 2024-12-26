package step14;

import java.io.*;
import java.util.*;

//10816 숫자 카드 2
public class Ex05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Map<Integer, Integer> myCardsMap = new HashMap<>();
        String[] myCards = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(myCards[i]);
            myCardsMap.put(number, myCardsMap.getOrDefault(number, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        List<Integer> cardList = new ArrayList<>();

        String[] findCards = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            cardList.add(Integer.parseInt(findCards[i]));
        }

        for (Integer val : cardList) {
            if (myCardsMap.get(val) != null) {
                bw.write(myCardsMap.get(val) + " ");
            } else {
                bw.write(0 + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}
