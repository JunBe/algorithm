package step13;

import java.io.*;

//2751 수 정렬하기
public class Ex04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int left = 0;
        int right = N - 1;
        int[] arr = new int[N];
        int[] tmp = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        merge_sort(arr, tmp, left, right);

        for (int val : arr) {
            bw.write(val + "\n");
        }

        bw.flush();
        bw.close();
    }

    private static void merge_sort(int[] arr, int[] result, int left, int right) {
        int mid = (left + right) / 2;

        if (left < right) {
            merge_sort(arr, result, left, mid);
            merge_sort(arr, result, mid + 1, right);
            merge(arr, result,left, mid, right);
        }
    }

    private static void merge(int[] arr, int[] result, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int pos = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                result[pos++] = arr[i++];
            } else {
                result[pos++] = arr[j++];
            }
        }

        if (i > mid) {
            for (int l = j; l <= right; l++) {
                result[pos++] = arr[l];
            }
        } else {
            for (int l = i; l <= mid; l++) {
                result[pos++] = arr[l];
            }
        }

        for (int l = left; l <= right; l++) {
            arr[l] = result[l];
        }

    }
}
