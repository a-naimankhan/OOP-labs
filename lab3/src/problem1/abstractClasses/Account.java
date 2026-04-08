package problem1.abstractClasses;

public abstract class Account {
    private Double balance;
    private String name;

    abstract void addInterest();

    public Account (String name , double balance) {
        this.name = name;
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
