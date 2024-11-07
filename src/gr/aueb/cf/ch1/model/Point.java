package gr.aueb.cf.ch1.model;

/**
 * A POJO {@link Point} class.
 *
 * @author papan
 * @version 1.0
 * @since 1.0
 */

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
