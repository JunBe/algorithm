package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

//스킬트리
//https://school.programmers.co.kr/learn/courses/30/lessons/49993
public class Ex01_2 {
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        // skill : 선행스킬 순서 / 1 ~ 26
        // skill_trees[] : 스킬트리 / 배열 크기 : 1 ~ 20 , 원소 길이 : 2 ~ 26 / 스킬 중복 x
        //C - B - D : CBD
        ArrayList<String> skilltree= new ArrayList<>(Arrays.asList(skill_trees));
        Iterator<String> it= skilltree.iterator();

        while(it.hasNext()){//스킬트리 순서대로 탐색

            //skilltree 원소에 skill과 다른 원소 있다면 공백으로 대체
            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
                it.remove(); //skill와 skilltree 순서 같지 않다면 삭제
            }
        }
        answer = skilltree.size(); // 삭제되지 않은 skilltree 만이 정답이 될 수 있다.

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
