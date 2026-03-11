package lab2.task5.registery;

import lab2.task5.model.people.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    private List<Person> people;

    public PersonRegistry() {
        this.people = new ArrayList<>();
    }


    public void addPerson(Person p) {
        people.add(p);
    }

    public void removePerson(Person p) {
        people.remove(p);
    }

    public List<Person> getPeopleWithPets() {
        List<Person> withPets = new ArrayList<>();
        for (Person p: people) {
            if (p.hasPet()) withPets.add(p);
        }
        return withPets;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("--- PERSON REGISTRY ---\n");
        for (Person p : people) {
            sb.append("- ").append(p.toString()).append("\n");
        }
        return sb.toString();
    }

}
