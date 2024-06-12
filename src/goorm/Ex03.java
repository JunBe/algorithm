package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//뱀이 지나간 자리
public class Ex03 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //행
        int M = Integer.parseInt(st.nextToken()); //열

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(i%2==0){ // 홀수 행
                    System.out.print("#");
                }else{ // 짝수 행
                    if(i%4==1){ // 뒤에 #가 있는 행
                        if(j==M-1){
                            System.out.print("#");
                        }else{
                            System.out.print(".");
                        }
                    }else if(i%4==3){ // 앞에 #가 있는 행
                        if(j==0){
                            System.out.print("#");
                        }else{
                            System.out.print(".");
                        }
                    }
                }
            }
            System.out.println();
        }

    }

}
