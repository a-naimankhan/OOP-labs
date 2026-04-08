package problem1.Intreface;

public class Plane implements Moveable , Flyable {
    private String model;

    public Plane(String model) {
        this.model = model;
    }

    public void fly() {
        System.out.println("Plane : "  + this.model + "is flying ");
    }

    public void Move() {
        System.out.println("Plane can't move tf u mean ?:D");
    }
}
