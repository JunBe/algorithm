package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//
public class Ex05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //단어 수
        String[] str = new String[N]; //문장
        for (int i = 0; i < str.length; i++) {
            str[i] = br.readLine();
        }

        for (int i = 0; i < str.length; i++) {

            boolean tf = false; //모음 발견시 true
            for (char x : str[i].toCharArray()) {
                if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') { //모음
                    System.out.print(x);
                    tf = true;
                }
            }
            if (!tf) { //모음을 발견하지 못했을 경우
                System.out.print("???");
            }
            System.out.println();
        }

    }
}
