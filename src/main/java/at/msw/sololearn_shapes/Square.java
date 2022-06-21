package at.msw.sololearn_shapes;

public class Square extends Shape {
    private double width;

    public Square(double width) {
        super(width);
    }

    public Square() {
        super();
    }

    @Override
    public double area() {
        return Math.pow(this.width,2);
    }

    @Override
    public double area(double width) {
        return Math.pow(width,2);
    }
}
