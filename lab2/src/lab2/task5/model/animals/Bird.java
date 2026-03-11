package lab2.task5.model.animals;

public class Bird extends Animal {

    public Bird(String name  ,int age ) {
        super(name , age);
    }


    @Override
    public void getSound() {
        System.out.println("Glub-Glub");
    }

}
