package lab2.task5.model.animals;

import problem4.interfaces.Speakable;

public class Cat extends Animal implements Speakable {
    public Cat(String name , int age ) {
        super(name , age);

    }


    @Override
    public void getSound() {
        System.out.println("Meow");
    }

    public void sayHello() {
        System.out.println("Meeooow , or MRrr");
    }

}
