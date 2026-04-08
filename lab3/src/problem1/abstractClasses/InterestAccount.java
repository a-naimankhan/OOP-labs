package problem1.abstractClasses;

public class InterestAccount extends Account {
    private Double interestRate;


    public InterestAccount(String name , double balance , double interestRate) {
        super(name , balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double newBalance =getBalance() +  (getBalance() * interestRate);
        setBalance(newBalance);
    }
}
