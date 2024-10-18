package goorm;

import java.util.Scanner;

//고장난 컴퓨터
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 키보드를 누른 횟수
        int c = sc.nextInt(); // 코드가 유지되는 시간
        int[] t = new int[N]; //키보드를 누른 시간
        for(int i=0; i<N; i++){
            t[i]= sc.nextInt();
        }

        int num=0; // 현재 글자의 개수
        int sec=0; //경과한 시간
        int j=0; // 배열 조작 변수
        for(int i=0; i<=t[N-1]; i++){ // 0 부터 마지막 인덱스의 초까지 반복
            if (j < N && i == t[j]) { // 키보드를 눌렀다면 시간 초기화 및 num 카운트
                j++;
                num++;
                sec = 0;
            }

            sec++;
            if (sec > c) { // c초가 지났다면 글자 개수 초기화
                num = 0;
            }

        }
        System.out.println(num);

    }
}
