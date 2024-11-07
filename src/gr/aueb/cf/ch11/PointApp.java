package gr.aueb.cf.ch11;

/**
 * {@link Point} driver class.
 *
 * author gp
 */

public class PointApp {

    public static void main(String[] args) {
        Point p1 = new Point(); // (0,0)
        Point p2 = new Point(1, 2);
        Point p3 = new Point();

        Point p4 = Point.getPoint();
        Point p5 = Point.getRandomPoint();

        p3.setX(7);
        p3.setY(12);

        System.out.println(p1.pointToString());
        System.out.println(p2.pointToString());
        System.out.println(p3.pointToString());
        System.out.println(p4.pointToString());
        System.out.println(p5.pointToString());
    }
}
