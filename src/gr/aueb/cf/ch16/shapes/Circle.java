package gr.aueb.cf.ch16.shapes;

public class Circle extends AbstractShape implements ICircle, ITwoDimensional{

    private double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }
}
