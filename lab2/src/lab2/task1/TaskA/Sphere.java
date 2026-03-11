package lab2.task1.TaskA;

public class Sphere extends Shape3D {
    private double r;

    public Sphere(double radius) {
        this.r = radius;
    }

    @Override
    public double Volume() {
        return (4/3) * Math.PI * (r*r*r);
    }

    @Override
    public double SurfaceArea() {
        return 4 * Math.PI * r * r;
    }
}
