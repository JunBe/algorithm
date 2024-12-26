package step14;

import java.io.*;
import java.util.*;

//11478 서로 다른 부분 문자열의 개수
public class Ex08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        int length = S.length();

        //ababc의 부분 문자열은 a, b, a, b, c, ab, ba, ab, bc, aba, bab, abc, abab, babc, ababc

        Set<String> set = new HashSet<>();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                set.add(S.substring(i, i + j + 1));
            }
        }

        bw.write(set.size() + "");
        bw.flush();
        bw.close();
    }
}
