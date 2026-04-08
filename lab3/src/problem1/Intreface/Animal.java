package problem1.Intreface;

import javax.xml.namespace.QName;

public class Animal implements Moveable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void Move() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "kitten " +getName() + "Moved";
    }
}
