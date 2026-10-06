package task2;

public class Main {
    public static void main(String[] args) {
        Vector3D v1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D v2 = new Vector3D(4.0, 5.0, 6.0);
        double num = 2.5;

        double scalarRes = v1.scalarPr(v2);
        System.out.println("Scalar Product: " + scalarRes);

        Vector3D vectorRes = v1.vectorPr(v2);
        System.out.println("Vector Product: " + vectorRes);

        Vector3D numRes = v1.numberPr(num);
        System.out.println("Vector Product: " + numRes);
    }
}