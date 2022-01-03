import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p) {
        if(this.x == p.x) {
            return this.y - p.y;
        } else {
            return this.x - p.x;
        }
    }

    @Override
    public String toString() {
        return this.x + " " + this.y;
    }
}

public class BJ11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());

        ArrayList<Point> list = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            String[] tokens = sc.nextLine().split(" ");
            int x = Integer.parseInt(tokens[0]);
            int y = Integer.parseInt(tokens[1]);
            list.add(new Point(x, y));
        }
        Collections.sort(list);
        for (Point p : list) {
            System.out.println(p);
        }
    }
}
