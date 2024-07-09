package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//플러스 마이너스
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(sc.nextInt());
        }

        float positiveCount=0;
        float negativeCount=0;
        float zeroCount=0;
        for (Integer x : arr) {
            if(x>0){
                positiveCount++;
            }else if(x<0){
                negativeCount++;
            }else{
                zeroCount++;
            }
        }

        System.out.println(positiveCount/N);
        System.out.println(negativeCount/N);
        System.out.println(zeroCount/N);


    }
}
