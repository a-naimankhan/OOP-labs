package lab1.task4;

public class Course {
    private String name;
    private String description;
    private int numberOfCredits;
    private String prerequisite;

    public Course(String name , String description , int numberOfCredits , String prerequisite) {
        this.name = name;
        this.description = description;
        this.numberOfCredits = numberOfCredits;
        this.prerequisite = prerequisite;
    }

//    public Course(String name , String description , int numberOfCredits ) {
//        this(name , description , numberOfCredits);
//    }

   @Override
    public String toString() {
        return "name : " + this.name + "\nDescription : " + this.description;
   }

}
