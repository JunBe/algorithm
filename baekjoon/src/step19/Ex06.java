package step19;

import java.io.*;

// 2447 별 찍기-10
public class Ex06 {
    public static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = bf.readLine();
        int N = Integer.parseInt(s);
        arr = new int[N][N];
        star(N, 0, 0);
        for (int[] ints : arr) {
            for (int val : ints) {
                if (val == 0) {
                    bw.write("*");
                } else {
                    bw.write(" ");
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    private static void star(int n, int x, int y) {
        int N = n / 3;


        if (n >= 3) {

            for (int i = x + N; i < x + N * 2; i++) {
                for (int j = y + N; j < y + N * 2; j++) {
                    arr[i][j] = 1;
                }
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == 1 && j == 1) {
                        continue;
                    }
                    star(N, x + i * N, y + j * N);
                }
            }

        }

    }
}
