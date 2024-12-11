package step13;

import java.util.*;

//11650 좌표 정렬하기
public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Position> lists = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            lists.add(new Position(x, y));
        }

        ComparatorXY comparator = new ComparatorXY();

        Collections.sort(lists,comparator);

        for (Position list : lists) {
            System.out.println(list.getX() + " " + list.getY());
        }
    }
}

class ComparatorXY implements Comparator<Position> {

    @Override
    public int compare(Position first, Position second) {
        int firstValue = first.getX();
        int secondValue = second.getX();
        if (firstValue > secondValue) {
            return 1;
        } else if (firstValue < secondValue) {
            return -1;
        } else if (firstValue == secondValue) {
            if (first.getY() > second.getY()) {
                return 1;
            } else if (first.getY() < second.getY()) {
                return -1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}

class Position {
    int x;
    int y;

    public Position(int x, int y) {
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
