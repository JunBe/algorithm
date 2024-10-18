package level2;

import java.util.Scanner;

//스킬트리
//https://school.programmers.co.kr/learn/courses/30/lessons/49993
public class Ex01 {
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        // skill : 선행스킬 순서 / 1 ~ 26
        // skill_trees[] : 스킬트리 / 배열 크기 : 1 ~ 20 , 원소 길이 : 2 ~ 26 / 스킬 중복 x
        //C - B - D : CBD

        for (String skills : skill_trees) { //스킬트리 배열 반복
            int i = 0; // 선행스킬 인덱스 조작
            boolean tf = true; // 스킬트리 참거짓 여부
            for (char x : skills.toCharArray()) { //스킬트리의 스킬배열 반복
                if (skill.indexOf(x) != -1) { //x가 선행스킬이라면
                    if (skill.charAt(i) == x) { //선행스킬의 순서를 만족해야함
                        i++;
                    } else { // 다르면 스킬트리가 아님
                        tf = false;
                        break;
                    }
                }
            }

            if (tf) { // 스킬트리라면
                answer++; // answer 카운트
            }
        }

        return answer; //가능한 스킬트리 개수
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String skill = sc.next();
        String[] skill_trees = new String[n];
        for (int i = 0; i < skill_trees.length; i++) {
            skill_trees[i]=sc.next();
        }
        System.out.println(solution(skill, skill_trees));
    }
}
