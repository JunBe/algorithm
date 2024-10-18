package hackerrank;

import java.util.Scanner;

//시간 변환
public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        String chkTime = date.substring(date.length()-2);
        if(chkTime.equals("PM")) {
            int changeTime = Integer.parseInt(date.substring(0, 2))+12;
            if(changeTime==24){
                changeTime-=12;
            }
            String change = Integer.toString(changeTime);
            String resultDate = change + date.substring(2,8);
            System.out.println(resultDate);
        }else{
            if(Integer.parseInt(date.substring(0, 2))==12){
                System.out.println("00"+date.substring(2,8));
            }else {
                System.out.println(date.substring(0, 8));
            }

        }
    }
}
