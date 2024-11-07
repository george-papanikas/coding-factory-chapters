package gr.aueb.cf.ch15;

/**
 * Composition & Forwarding
 * Wrapper & Decoration
 * Delegation
 */
public class Point2DNew {
    // Composition - private instance
    private Point point; //αντι να κανει extends Point κανω composition
    private int y;

    public Point2DNew() {}

    public Point2DNew(Point point, int y) {
        this.point = point;
        this.y = y;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //Forwarding
    public void movePlusTen() {
        point.movePlusTen();
        y += 10; // decoration
    }

    public void movePlusOne() {
        point.movePlusOne();
        y += 1;
    }

    public String toString() {
       return point + "," + y;
    }

}
