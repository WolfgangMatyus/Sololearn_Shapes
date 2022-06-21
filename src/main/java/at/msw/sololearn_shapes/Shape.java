package at.msw.sololearn_shapes;

public abstract class Shape {

    private double width;
    public Shape() {}
    public Shape(double width) {
        this.width = width;
    }

    public abstract double area();

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public abstract double area(double width);
}
