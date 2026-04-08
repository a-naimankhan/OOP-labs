package problem1.Intreface;

public class Human implements Moveable{
    private String name;

    public Human (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void Move() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Human " + getName() + "walked";
    }
}
