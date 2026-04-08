package problem1.Intreface;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Animal animal = new Animal("Lion ");
        Human human = new Human("No name ");
        Plane plane = new Plane("BOEING 747");
        List<Moveable> movers = new ArrayList<>();

        movers.add(animal);
        movers.add(human);
        movers.add(plane);

        for (Moveable moveable : movers) {
            moveable.Move();
        }
        plane.fly();



        //или нужно сделать так что он показать полиморфизм тоесть сохранить в аррей лист и туда запихнуть разные типы людей и животных и просто вызвать мув и похуй было
    }
}
