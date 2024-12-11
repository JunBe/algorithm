package step13;

import java.util.*;

//11651 좌표 정렬하기2
public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Position2> lists = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            lists.add(new Position2(x, y));
        }

        ComparatorXY2 comparator = new ComparatorXY2();

        Collections.sort(lists,comparator);

        for (Position2 list : lists) {
            System.out.println(list.getX() + " " + list.getY());
        }
    }
}

class ComparatorXY2 implements Comparator<Position2> {

    @Override
    public int compare(Position2 first, Position2 second) {
        int firstValue = first.getY();
        int secondValue = second.getY();
        if (firstValue > secondValue) {
            return 1;
        } else if (firstValue < secondValue) {
            return -1;
        } else if (firstValue == secondValue) {
            if (first.getX() > second.getX()) {
                return 1;
            } else if (first.getX() < second.getX()) {
                return -1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}

class Position2 {
    int x;
    int y;

    public Position2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
