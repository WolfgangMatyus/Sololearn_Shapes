package at.msw.sololearn_shapes;

public class Circle extends Shape{
    private double width;

    public Circle(double width) {
        super(width);
    }

    @Override
    public double area() {
        return (Math.PI*Math.pow(this.width,2));
    }

    @Override
    public double area(double width) {
        return (Math.PI*Math.pow(width,2));
    }
}
