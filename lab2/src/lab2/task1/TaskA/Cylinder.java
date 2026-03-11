package lab2.task1.TaskA;

public class Cylinder  extends Shape3D{
    private double radius , height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double Volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public double SurfaceArea() {
        return 2*Math.PI * radius * (radius + height);
    }
}
