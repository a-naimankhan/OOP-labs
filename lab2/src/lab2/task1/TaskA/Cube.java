package lab2.task1.TaskA;

public class Cube extends Shape3D{
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double Volume() {
        return side * side * side;
    }

    @Override
    public double SurfaceArea() {
        return 6 * side * side;
    }
}
