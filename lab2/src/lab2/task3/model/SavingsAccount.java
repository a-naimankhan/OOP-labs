package lab2.task3.model;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int a , double rate) {
        super(a);
        this.interestRate = rate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate;
//        System.out.println("interest : " + interest + " added ");
        if (interest > 0) {
            deposit(interest);
        }

    }
}
