package task3;

public class Romb extends Shape {
    public double side, diag1, diag2;

    public Romb(double side, double diag1, double diag2) {
        super("Romb");
        this.side = side;
        this.diag1 = diag1;
        this.diag2 = diag2;
    }

    @Override
    public double getArea() {
        return (diag1 * diag2) / 2;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}