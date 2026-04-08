package problem4.models;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person : " + getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if ((o == null) || (getClass() != o.getClass())) return false;

        Person person = (Person) o;

        return java.util.Objects.equals(name , person.name);
    }
}
