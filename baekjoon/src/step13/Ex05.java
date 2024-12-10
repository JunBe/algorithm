package step13;

import java.io.*;
import java.util.Arrays;

//10989 수 정렬하기 3
public class Ex05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for (int val : arr) {
            bw.write(val + "\n");
        }

        bw.flush();
        bw.close();
    }
}
