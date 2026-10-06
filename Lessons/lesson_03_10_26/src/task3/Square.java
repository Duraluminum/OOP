package task3;

public class Square extends Shape {
    public double a;

    public Square(double a) {
        super("Square");
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }
}