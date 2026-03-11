package lab2.task3.model;

public class Account {
    private double balance;
    private int accNumber;

    public Account(int a){
        balance = 0.0;
        accNumber = a;
    }

    public void deposit(double amount){
        if (amount <= 0) {
            throw new IllegalArgumentException("Not valid arguments");
        }
        this.balance += amount;
    }

    public void withDrawl(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Not valid arguments");
        }
        this.balance -= amount;
    }

    //transfers balance from this acc to the other acc
    public void transfer(double amount , Account other) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Not valid arguments");
        }

        if (this.balance > amount) {
            this.withDrawl(amount);
        }
        //have to add try catch block to check or just check if this acc has enough money
        other.deposit(amount);
    }

    public double getBalance() {
        return balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    @Override
    public String toString() {
        return "Account : " + accNumber + "\nBalance : " + this.getBalance();
    }

    public final void print(){
        System.out.println(toString());
    }
}
