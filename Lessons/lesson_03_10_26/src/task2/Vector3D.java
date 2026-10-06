package task2;

public class Vector3D {
    private double x, y, z;
    
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double scalarPr(Vector3D other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    public Vector3D vectorPr(Vector3D other) {
        return new Vector3D(
            this.y * other.z - this.z * other.y,
            this.z * other.x - this.x * other.z,
            this.x * other.y - this.y * other.x
        );
    }

    public Vector3D numberPr(double num) {
        return new Vector3D(this.x * num, this.y * num, this.z * num);
    }
}