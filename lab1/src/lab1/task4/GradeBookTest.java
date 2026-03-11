import java.util.Scanner;
import java.util.ArrayList;

import Practise2Student.Student;
import lab1.task4.Course;
import lab1.task4.GradeBook;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Course myCourse = new Course("CS101", "OOP", 3, "None");
        ArrayList<Student> studentsList = new ArrayList<>();

        System.out.println("Please, input grades for students (type 'Q' to stop):");


        while (true) {
            System.out.print("Enter grade: ");
            String input = sc.next();
            if (input.equalsIgnoreCase("Q")) break;

            double grade = Double.parseDouble(input);

            Student s = new Student("SomeName", 2 , grade);
            studentsList.add(s);
        }

        GradeBook myGB = new GradeBook(myCourse , studentsList);
        myGB.displayMessage();
        myGB.displayGradeReport();
    }
}