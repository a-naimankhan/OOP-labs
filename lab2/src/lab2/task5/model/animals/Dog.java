package lab2.task5.model.animals;

public class Dog extends Animal {

    public Dog(String name , int age) {
        super(name , age);
    }

    @Override
    public void getSound() {
        System.out.println("Gav-Gav/Roaf");
    }

}
