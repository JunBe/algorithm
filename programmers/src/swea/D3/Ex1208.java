package swea.D3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1208 {
    public static int solution(int count, int[] arr) {
        Arrays.sort(arr);
        /*
        맨 첫 번째 +1 와 맨 뒤 -1
        맨 첫 번째가 뒤로 가면서 자기보다 작은거 있다면 교환(한번이 아닌 크거나 같은게 나올 때 까지) -> break
        맨 뒤가 앞으로 가면서 자기보다 큰게 있다면 교환 (한번이 아닌 작거나 같은게 나올 때 까지) -> break
        */

        for (int i = 0; i < count; i++) {
            arr[0] += 1;
            arr[99] -= 1;

            for (int j = 0; j < 99; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                } else {
                    break;
                }
            }

            for (int j = 99; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                } else {
                    break;
                }
            }
        }

        return arr[99] - arr[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        int[] arr = new int[100];

        for (int i = 1; i <= 10; i++) {
            count = sc.nextInt();
            for (int j = 0; j < 100; j++) {
                arr[j] = sc.nextInt();
            } //100개 잘 넣어짐

            System.out.println("#" + i + " " + solution(count, arr));
        }
    }
}
