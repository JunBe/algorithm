package step21;

import java.util.Scanner;

//9461 파도반 수열
public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int N = sc.nextInt();
            long[] arr = new long[N];
            if (N <= 5) {
                switch (N) {
                    case 1:
                        System.out.println(1);
                        break;
                    case 2:
                        System.out.println(1);
                        break;
                    case 3:
                        System.out.println(1);
                        break;
                    case 4:
                        System.out.println(2);
                        break;
                    case 5:
                        System.out.println(2);
                        break;
                }
            } else {
                arr[0] = 1;
                arr[1] = 1;
                arr[2] = 1;
                arr[3] = 2;
                arr[4] = 2;
                for (int x = 5; x < N; x++) {
                    arr[x] = arr[x - 1] + arr[x - 5];
                }
                System.out.println(arr[N-1]);
            }
        }
    }
}
