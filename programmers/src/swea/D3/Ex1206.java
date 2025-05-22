package swea.D3;

import java.util.Scanner;

public class Ex1206 {
    public static int solution(int N, int[] arr) {
        int ans = 0;
        for (int i = 2; i < N - 2; i++) { // 10개라면 3~8 건물만 체크
            int lt = 0;
            int rt = 0;

            if (arr[i] > arr[i - 1] && arr[i] > arr[i - 2]) {
                lt = Math.min(arr[i] - arr[i - 1], arr[i] - arr[i - 2]);
            }

            if (arr[i] > arr[i + 1] && arr[i] > arr[i + 2]) {
                rt = Math.min(arr[i] - arr[i + 1], arr[i] - arr[i + 2]);
            }

            if (lt > 0 && rt > 0) {
                ans += Math.min(lt, rt);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 10;
        int N = 0;
        for (int i = 1; i <= T; i++) {
            N = sc.nextInt();
            int[] arr = new int[N];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println("#" + i + " " + solution(N, arr));
        }
    }
}
