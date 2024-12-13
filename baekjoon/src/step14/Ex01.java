package step14;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//10815 숫자 카드
public class Ex01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> myCard = new ArrayList<>();
        List<Integer> answerNumber = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());
        String[] splitN = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            myCard.add(Integer.parseInt(splitN[i])); // n
        }

        int M = Integer.parseInt(br.readLine());
        String[] splitM = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            answerNumber.add(Integer.parseInt(splitM[i])); // n
        }

        Collections.sort(myCard);

        for (Integer val : answerNumber) {

            if (findIndex(0, N - 1, val, myCard)) {
                bw.write(1 + " ");
            } else {
                bw.write(0 + " ");
            }
        }

        bw.flush();
        bw.close();
    }

    private static boolean findIndex(int low, int high, int findValue, List<Integer> myCard) {
        int mid = (low + high) / 2;

        if (findValue > myCard.get(mid)) {
            low = mid + 1;
            if (low > high) {
                return false;
            }
            return findIndex(low, high, findValue, myCard);
        } else if (findValue < myCard.get(mid)) {
            high = mid;
            if (low >= high) {
                return false;
            }
            return findIndex(low, high, findValue, myCard);
        } else {
            return true;
        }

    }
}
