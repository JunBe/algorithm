package level1;

import java.util.Arrays;
import java.util.Scanner;

//https://school.programmers.co.kr/learn/courses/30/lessons/42862
//체육복
public class Ex02 {
        public static int solution(int n, int[] lost, int[] reserve) {
            int answer = 0;

            //n : 전체 학생 수  / 2~30
            //lost[] : 체육복 도난당한 학생들의 번호 / 1~n 중복x
            //reserve[] : 여벌의 옷 가진 학생들의 번호 / 1~n 중복x / 도난당했을 수도 있음
            answer=n;
            Arrays.sort(lost);
            Arrays.sort(reserve);
            for(int i=0;i<reserve.length;i++){
                for(int j=0;j<lost.length;j++){
                    if(reserve[i]==lost[j]){
                        reserve[i]=-1;
                        lost[j]=-1;
                    }
                }
            }

            for(int x : reserve){
                for(int i=0;i<lost.length;i++){
                    if(lost[i]==-1){
                        continue;
                    }
                    if(x==lost[i]){
                        lost[i]=-1;
                        break;
                    }else if(x==(lost[i]-1)){  //잃어버린 사람이 1만큼 큼
                        lost[i]=-1;
                        break;
                    }else if(x==(lost[i]+1)){  //잃어버린 사람이 1만큼 작음
                        lost[i]=-1;
                        break;
                    }
                }
            }

            for(int x:lost){
                if(x!=-1) answer--;
            }
            return answer;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lostN = sc.nextInt();
        int[] lost = new int[lostN];
        for (int i = 0; i < lostN; i++) {
            lost[i] = sc.nextInt();
        }
        int reserveN = sc.nextInt();
        int[] reserve = new int[reserveN];
        for (int i = 0; i < reserveN; i++) {
            reserve[i] = sc.nextInt();
        }
        System.out.println(solution(n,lost,reserve));
    }
}
