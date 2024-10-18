package boostex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] type = new String[n];
        String ans = ""; // 8개마다 , 출력

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<n ; i++){
            type[i] = st.nextToken();
        }

        for (String s : type) {
            if(s.equals("BOOL")){
                ans += "#";
            }else if(s.equals("SHORT")){
                if(ans.length()%2==0){
                    ans += "##";
                }else {
                    ans += ".##";
                }
            }else if(s.equals("FLOAT")){
                if(ans.length()%4==1){
                    ans += "...####";
                }else if (ans.length()%4==2){
                    ans += "..####";
                } else if (ans.length() % 4 == 3) {
                    ans += ".####";
                } else {
                    ans += "####";
                }
            }else if(s.equals("INT")){
                if (ans.length() % 8 == 0) {
                    ans += "########";
                } else {
                    for (int i = ans.length() % 8;i<8;i++ ) {
                        ans += ".";
                    }
                    ans += "########";
                }

            }else if(s.equals("LONG")){
                if (ans.length() % 8 == 0) {
                    ans += "################";
                } else {
                    for (int i = ans.length() % 8; i < 8; i++) {
                        ans += ".";
                    }
                    ans += "################";
                }
            }

        }
        //,는 ans2 for문 돌릴때 8배수끝날 때 마다 출력

        if (ans.length() <= 128) {
            for (int i = 0; i < ans.length(); i++) {
                System.out.print(ans.charAt(i));
                if (i % 8 == 7 && i != ans.length() - 1) {
                    System.out.print(",");
                }
                if (ans.length() % 8 != 0) {
                    for (int j = ans.length() % 8; j < 8; j++) {
                        ans += ".";
                    }
                }
            }
        } else {
            System.out.println("HALT");
        }
    }
}
