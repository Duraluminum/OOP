package task3;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        
        shapes[0] = new Circle(5.0);
        shapes[1] = new Square(4.0);
        shapes[2] = new Rectangle(4.0, 6.0);
        shapes[3] = new Triangle(3.0, 4.0, 5.0);
        shapes[4] = new Romb(5.0, 6.0, 8.0); 

        for (Shape shape : shapes) {
            System.out.printf("Shape: %s%n", shape.getName());
            System.out.printf("Area: %.2f%n", shape.getArea());
            System.out.printf("Perimeter: %.2f%n", shape.getPerimeter());
            System.out.println("---");
        }
    }
}