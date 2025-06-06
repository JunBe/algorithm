package swea.D3;

import java.util.*;

public class Ex5215 {
    public static int solution(int N, int L, double[][] arr) {
        Arrays.sort(arr, (o1, o2) -> Double.compare(o2[2], o1[2]));
        int sum = 0;

//        for (double[] val : arr) {
//            System.out.println("점수 : " + val[0] + " 칼로리 : " + val[1] + " 평점 : " + val[2]);
//        }

        for (int i = 0; i < N; i++) {
//            arr[i][0] // 점수
//            arr[i][1] // 칼로리
//            arr[i][2] // 비율
            if (L >= arr[i][1]) {
                L -= (int) arr[i][1];
                sum += (int) arr[i][0];
//                System.out.println(arr[i][0]);
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        // 재료의 점수, 재료의 칼로리 제공
        // 정해진 칼로리 이하의 가장 맛있는 조합을 만들어라
        // 재료들의 점수의 합이 높으면 가장 맛있는 조합
        //0.5, 0.7, 0.9, 0.5, 1

        // 1칼로리당 점수를 계산
        // list에 저장 후 0 -> N 탐색
        // 탐색 중 칼로리에 맞지 않으면 넘어가고 칼로리에 맞으면 추가
        // 추가된 칼로리들의 합 리턴

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();
            int L = sc.nextInt();
            double[][] arr = new double[N][3];

            for (int j = 0; j < N; j++) {
                arr[j][0] = sc.nextInt();
                arr[j][1] = sc.nextInt();
                arr[j][2] = arr[j][0] / arr[j][1];
            }

            System.out.println("#" + i + " " + solution(N, L, arr));
        }
    }
}
