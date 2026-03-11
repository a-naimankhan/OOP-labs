package lab1.task5;

enum Gender {
    BOY , GIRL
}

public class Person {
    Gender gender;

    public Person(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return gender == Gender.BOY ? "B" : "G";
    }
}
