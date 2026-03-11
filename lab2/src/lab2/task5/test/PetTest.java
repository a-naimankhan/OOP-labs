package lab2.task5.test;

import lab2.task5.model.animals.Animal;
import lab2.task5.model.animals.Cat;
import lab2.task5.model.animals.Dog;
import lab2.task5.model.people.Employee;
import lab2.task5.model.people.Person;
import lab2.task5.model.people.PhDStudent;
import lab2.task5.registery.PersonRegistry;

public class PetTest {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science","AI");
        Animal murka = new Cat("Murka", 5);
        john.assignPet(murka); // John owns Rex
        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
        // John goes on vacation and leaves Rex with Alice
         john.leavePetWith(alice);
         // Registry reflects that Alice is taking care of Rex
         System.out.println(registry);
         // John returns from vacation and retrieves Rex
         john.retrievePetFrom(alice);
         // Registry reflects that John has his dog back
         System.out.println(registry);


         //checking Asssigning a Dog to a PhD student
        Person dias = new PhDStudent("Dias", 25, "Math", "Theory of limits");
        Animal dog = new Dog("Aqtos", 3);

        dias.assignPet(dog);

         System.out.println("-People who don't have any pets : " + registry.getPeopleWithPets());
    }
}
