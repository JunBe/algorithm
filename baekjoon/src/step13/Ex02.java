package step13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//2587 대표값
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(sc.nextInt());
        }
        Collections.sort(numbers);
        int average = 0;
        int median = numbers.get(2);
        for (Integer number : numbers) {
            average += number;
        }
        average = average / 5;

        System.out.println(average);
        System.out.println(median);
    }
}
