package step12;

import java.util.Scanner;

//1018 체스판 다시 칠하기
public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = sc.next();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                min = Math.min(getNeedSquareCount(i, j, board), min);
            }
        }

        System.out.println(min);

    }

    private static int getNeedSquareCount(int N, int M, char[][] board) {
        int countB = 0;
        int countW = 0;
        for (int i = N; i < N + 8; i++) {
            for (int j = M; j < M + 8; j++) {
                if ((i + j) % 2 == 0) { //B
                    if (board[i][j] == 'W') {
                        countB++;
                    }
                } else { //W
                    if (board[i][j] == 'B') {
                        countB++;
                    }
                }
            }
        }

        for (int i = N; i < N + 8; i++) {
            for (int j = M; j < M + 8; j++) {
                if ((i + j) % 2 == 0) { //W
                    if (board[i][j] == 'B') {
                        countW++;
                    }
                } else { //B
                    if (board[i][j] == 'W') {
                        countW++;
                    }
                }
            }
        }
        return Math.min(countB, countW);
    }
}
