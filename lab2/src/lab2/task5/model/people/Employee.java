package lab2.task5.model.people;

public class Employee extends Person{
    private String profession;

    public Employee(String name , int age , String profession) {
        super(name , age);
        this.profession = profession;
    }


    public String getProfession() {
        return profession;
    }

//    @Override
//    public String toString() {
//        return super.toString() + "\nPeroffesion : " + getProfession();
//    }

    // В классе Employee
    @Override
    public String toString() {
        return super.toString() + " [Position: " + profession + "]";
    }


}
