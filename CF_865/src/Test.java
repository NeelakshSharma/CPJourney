import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static List<Point> getTwoJumps(int a, int b) {
        List<Point> points = new ArrayList<>();

        // Check if a and b are both even or both odd
        if ((a % 2 == 0 && b % 2 == 0) || (a % 2 == 1 && b % 2 == 1)) {
            int x = a / 2;
            int y1 = 0;
            int y2 = b;
            points.add(new Point(0, 0));
            points.add(new Point(x, y1));
            if (y2 != y1) {
                points.add(new Point(x, y2));
            }
            points.add(new Point(a, b));
        } else {
            int x = a / 2;
            int y1 = 1;
            int y2 = b - 1;
            points.add(new Point(0, 0));
            points.add(new Point(x, y1));
            if (y2 != y1) {
                points.add(new Point(x, y2));
            }
            points.add(new Point(a, b));
        }

        return points;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Point> points = getTwoJumps(7, 10);
        for (Point p : points) {
            System.out.println("(" + p.x + ", " + p.y + ")");
        }
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
