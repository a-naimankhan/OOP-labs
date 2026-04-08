package lab2.task5.model.people;

import lab2.task5.model.animals.Animal;
import lab2.task5.model.animals.Dog;
import problem4.interfaces.Chilieable;

public class PhDStudent extends Person implements Chilieable {
    private String major;
    private String speacilization;

    public PhDStudent(String name , int age , String major , String speacilization) {
        super(name , age);
        this.major = major;
        this.speacilization = speacilization;
    }

    @Override
    public boolean assignPet(Animal pet) {

        if (pet instanceof Dog) {
            System.out.println("Constraint : PhD students can't care dog since they are busy(they just don't love them:( )");
            return false;
        }

        return super.assignPet(pet);
    }

    @Override
    public String getOccupation() {
        return  "PhD Student in " + major + ", focusing on " + speacilization;
    }

    public void chill() {
        System.out.println("Can't chill I'm phd student yo. I'm glad If i sleep 4 hours in a row");
    }

}
