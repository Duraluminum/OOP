package task3;

public class Rectangle extends Shape {
    public double a, b;

    public Rectangle(double a, double b) {
        super("Rectangle");
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }
}