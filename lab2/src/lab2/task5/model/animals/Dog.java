package lab2.task5.model.animals;

import problem4.interfaces.Chilieable;

public class Dog extends Animal implements Chilieable {

    public Dog(String name , int age) {
        super(name , age);
    }

    @Override
    public void getSound() {
        System.out.println("Gav-Gav/Roaf");
    }


    public void chill() {
        System.out.println("Just chilling oh sorry I mean aff aff woof");
    }
}
