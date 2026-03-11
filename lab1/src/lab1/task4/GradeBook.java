package lab1.task4;
import Practise2Student.Student;

import java.util.ArrayList;


public class GradeBook {

    private Course course;
    private ArrayList<Student> students;

    public GradeBook(Course course , ArrayList<Student> students) {
        this.course = course;
        this.students = students;
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.toString() + "!");
    }

    public double determineClassAverage() {
        if (students.isEmpty()) return 0;
        double sum = 0;
        for (Student s : students) {
            sum +=s.getGrade();
        }
        return sum / students.size();
    }

    public void outputBarChart() {
        System.out.println("Grades distribution:");
        int[] frequency = new int[11];

        for (Student s : students) {
            int grade = (int) s.getGrade();
            if (grade == 100) frequency[10]++;
            else frequency[grade/10]++;
        }

        for (int i = 0 ; i < frequency.length ; i++) {
            if (i == 10) System.out.printf("%5d" , 100);
            else System.out.printf("%02d-%02d " , i * 10 , i * 10 + 9);

            for (int stars = 0 ; stars < frequency[i]; stars++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public Student getLowestGradeStudent() {
        if (students.isEmpty()) return null;
        Student lowest = students.getFirst();
        for (Student s : students) {
            if (s.getGrade() < lowest.getGrade()) {
                lowest = s;
            }
        }
        return lowest;
    }

   public Student getHighestReport() {
        if (students.isEmpty()) return null;
        Student best = students.getFirst();
        for (Student s : students) {
            if (s.getGrade() > best.getGrade()) {
                best = s;
            }
        }
        return best;
   }

   public void displayGradeReport() {
        Student best = getHighestReport();
        Student worst =getLowestGradeStudent();
        double average = determineClassAverage();

        System.out.println("\n---Grade Report---");
        System.out.printf("Class average is %.2f.\n", average);

        if (worst != null && best != null) {
            System.out.printf("Lowest grade is %.0f (%s).\n" , worst.getGrade() , worst.getName());
            System.out.printf("Highest grade is %.0f (%s).\n" , best.getGrade() , best.getName());
        }

        System.out.println();
        outputBarChart();
   }
}
