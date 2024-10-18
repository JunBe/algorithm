package level1;

import java.util.Scanner;

// https://school.programmers.co.kr/learn/courses/30/lessons/67256
// 키패드 누르기
public class Ex01 {

        public static int[][] pos={
                {3,1}, //0
                {0,0}, //1
                {0,1}, //2
                {0,2}, //3
                {1,0}, //4
                {1,1}, //5
                {1,2}, //6
                {2,0}, //7
                {2,1}, //8
                {2,2}  //9
        };

        public static String solution(int[] numbers, String hand) {
            String answer = "";
            //1,4,7 -> 왼손 엄지
            //3,6,9 -> 오른손 엄지
            //2,5,8,0 -> 현재 키 기준 가까운 엄지
            //          if) 거리 같다 -> 자신의 손잡이 쪽 사용
            //numbers -> 번호 배열 / 0 ~ 9
            //hand -> 자신의 손 잡이 / left, right

            //ans -> 누른 엄지의 손 위치 추가 / left : L , right : R

            int[] lt = {3,0}; //*
            int[] rt = {3,2}; //#


            for(int i=0;i<numbers.length;i++){
                if(numbers[i]==1||numbers[i]==4||numbers[i]==7){ //왼손 엄지
                    answer+="L";
                    lt=pos[numbers[i]]; //왼엄지의 현재 키패드 숫자
                }else if(numbers[i]==3||numbers[i]==6||numbers[i]==9){ //오른손 엄지
                    answer+="R";
                    rt=pos[numbers[i]]; //오른엄지의 현재 키패드 숫자
                }else{ // 가까운 엄지 ( 2,5,8,0,*,# )
                    if(Math.abs(pos[numbers[i]][0]-lt[0])+Math.abs(pos[numbers[i]][1]-lt[1]) >
                            Math.abs(pos[numbers[i]][0]-rt[0])+Math.abs(pos[numbers[i]][1]-rt[1])){
                        answer+="R";
                        rt=pos[numbers[i]]; //오른엄지의 현재 키패드 숫자
                    }else if(Math.abs(pos[numbers[i]][0]-lt[0])+Math.abs(pos[numbers[i]][1]-lt[1]) <
                            Math.abs(pos[numbers[i]][0]-rt[0])+Math.abs(pos[numbers[i]][1]-rt[1])){
                        answer+="L";
                        lt=pos[numbers[i]];
                    }else{
                        if(hand.equals("left")) {
                            answer+="L";
                            lt=pos[numbers[i]];
                        }else{
                            answer+="R";
                            rt=pos[numbers[i]];
                        }
                    }
                }
            }
            return answer;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers={1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = sc.nextLine();
        System.out.println(solution(numbers,hand));
    }

}
