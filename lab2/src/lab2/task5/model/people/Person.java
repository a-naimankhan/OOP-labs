package lab2.task5.model.people;

import lab2.task5.model.animals.Animal;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;

    public Person(String name , int age) {
        this.name = name;
        this.age = age;
    }

    public boolean hasPet() {
        return this.pet != null;
    }

    public boolean assignPet(Animal pet) {
        //write some validation
        //if the pet really exists
        //If the Person is able to get the pet
//        if (this.pet == null) {
//            throw new Ill;
//            //To Do
//        }
        if (this.pet == null) {
            this.pet = pet;
            return true;
        }

        return false;


    }

    public void removePet() {
        this.pet = null;
        //Or think about how to remove it in other way.

    }

    public void leavePetWith(Person caretaker){
        if (this.pet == null) {
            System.out.println(name + "has no pets to leave");
            return;
        }


        if (caretaker.assignPet(this.pet)) {
            System.out.println(name + " left " + pet.getName() + " with " + caretaker.getName());
            this.removePet();
        } else {
            System.out.println(caretaker.getName() + "cannot take this pet");
        }
    }


    public void retrievePetFrom(Person caretaker) {
        if (caretaker.hasPet()) {
            this.assignPet(caretaker.getPet());
            caretaker.removePet();
        }
    }


    public String getOccupation() {
        return "";
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Animal getPet() {
        return pet;
    }

    @Override
    public String toString() {
        String petInfo = (pet != null) ? ", Pet: " + pet.getName() : ", No pet";
        return String.format("Person [Name: %s, Age: %d, Occupation: %s%s]",
                name, age, getOccupation(), petInfo);
    }

}
