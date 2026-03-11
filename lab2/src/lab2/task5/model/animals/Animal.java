package lab2.task5.model.animals;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name , int age) {
        this.name = name;
        this.age = age;
    }

    public void getSound() {
        System.out.println("Animal makes sound");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name : " + getName() + "age : " + getAge();
    }


}
