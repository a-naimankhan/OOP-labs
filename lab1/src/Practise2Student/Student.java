package Practise2Student;

public class Student {
    private String name;
    private int yearOfStudy;
    private int id;
    private double grade;

    private static int counter = 0;
    public Student(String name  , int year , double grade) {
        counter++;
        this.name = name;
        this.id = counter;
        this.yearOfStudy = year;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public double getGrade() {
        return this.grade;
    }

    public int getYearOfStudy() {
        return this.yearOfStudy;
    }

    public void incrementTheYearOfStudy(int amount) {
        yearOfStudy += amount;
    }

//    @Override
//    public String toSring() {
//        return name + " (ID: " + id + ")";
//    }

}
