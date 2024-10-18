package boostex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //입력할 숫자 수
        int[] arr = new int[n]; //배열 초기화

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){ //배열에 할당할 값 입력
            arr[i] = Integer.parseInt(st.nextToken());
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> ans = new HashMap<>();

        for(int x : arr){ //map에 값별 입력된 횟수 저장
            map.put(x,map.getOrDefault(x,0)+1);
        }


        for (Integer i : map.keySet()) {
            if(map.get(i)!=1){
                ans.put(i, map.get(i));
            }
        }

        if(ans.isEmpty()){
            System.out.println(-1);
        }else{
            for(int i : ans.keySet()){
                System.out.print(map.get(i) + " ");
            }
        }





    }
}
