package gr.aueb.cf.ch15;

public class Main {

    private final static Point[] points;
    private static int count = 0;
    private static int count2d = 0;
    private static int count3d = 0;

    static {
        points = new Point[] {
                new Point(1), new Point2D(1, 2), new Point3D(1, 2, 3),
                new Point(29), new Point3D(4, 9, 23)
        };
    }

    public static void main(String[] args) {

        Point p1 = new Point(0);
        Point2DNew p2 = new Point2DNew(p1, 0);
        p2.movePlusTen();
        System.out.println(p2); // toString() applied without being defined

        /*for (Point point : points) {
            if (point instanceof Point3D) {
                count3d++;
            } else if (point instanceof Point2D) {
                count2d++;
            } else {
                count++;
            }
        }*/

        System.out.println("Point instances: " + count);
        System.out.println("Point2D instances: " + count2d);
        System.out.println("Point3D instances: " + count3d);

        /*Point p1 = new Point();
        Point p2 = new Point2D();
        Point p3 = new Point3D(); // καλυτερα σαν τυπος να επιλεγεται ο ευρυτερος τυπος για μεηαλυτερη ευελιξια

        doMovePlus10(p1); // late binding as it is calculated at runtime, not at compile time
        doMovePlus10(p2);
        doMovePlus10(p3);

        ((Point2D)p2).setY(5);
        p3.movePlusOne(); // εχει γινει override οποτε την καλώ απευθείας
*/
    }

    public static void doMovePlus10(Point point) { // polymorphism parameter
        point.movePlusTen(); // polymorphism method
    }

    public static void doPrintPoint(Point point) {
        System.out.println(point); // here .toString() is called in order point to be printed
        // note that we should have created .toString() otherwise memory's position will be printed
    }
 }
