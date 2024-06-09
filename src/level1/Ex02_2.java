package level1;

import java.util.Arrays;
import java.util.Scanner;

//https://school.programmers.co.kr/learn/courses/30/lessons/42862
//체육복 다른 풀이
public class Ex02_2 {
        public static int solution(int n, int[] lost, int[] reserve) {
            int answer = n;

            //n : 전체 학생 수  / 2~30
            //lost[] : 체육복 도난당한 학생들의 번호 / 1~n 중복x
            //reserve[] : 여벌의 옷 가진 학생들의 번호 / 1~n 중복x / 도난당했을 수도 있음
            int[] people = new int[n]; //이 배열에 번호 순으로 체육복 현황 저장
            
            for (int x : lost) {
                people[x-1]--; // 도난 당한 학생 : -1
            }
            for (int y : reserve) {
                people[y-1]++; // 여분 있는 학생 : +1
            }
            // 도난 당하지도 여분 있지도 않은 학생 : 0

            //if) lost : 1,3 / reserve : 2,3,5
            //    -> people : {-1,1,0,0,1}
            for (int i = 0; i < n; i++) {
                if(people[i]==-1){ //1과 2 순서 바뀌면 안됨. ex){0,1,-1,1,-1}
                    if (i - 1 >= 0 && people[i - 1] == 1) { //1
                        people[i]++;
                        people[i-1]--;
                    }else if (i + 1 < n && people[i + 1] == 1) {//2
                        people[i]++;
                        people[i+1]--;
                    } else {
                        answer--;
                    }
                }
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
