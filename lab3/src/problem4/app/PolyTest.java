package problem4.app;

import lab2.task5.model.animals.Cat;
import lab2.task5.model.animals.Dog;
import lab2.task5.model.people.Employee;
import lab2.task5.model.people.PhDStudent;
import problem4.interfaces.Chilieable;
import problem4.interfaces.Speakable;

import java.util.ArrayList;
import java.util.List;

public class PolyTest {
    public static void main(String[] args) {
        List<Chilieable> chillers = new ArrayList<>();
        chillers.add(new Dog("REX", 2));
        chillers.add(new PhDStudent("Zadrot", 25, "CS", "ML"));

        System.out.println("\nTIME TO CHILL     ");
        for (Chilieable chilieable : chillers) {
            chilieable.chill();
        }


        List<Speakable>speakers = new ArrayList<>();
        speakers.add(new Cat("GALAXY-DESTROYER", 1));
        speakers.add(new Employee("Zavodchynann" , 40 , "ZAVOOD"));

        System.out.println("\nTIME TO SPEAAAK ");
        for (Speakable speakable : speakers) {
            speakable.sayHello();
        }
    }


}
