package lab2.task3.test;

import lab2.task3.logic.Bank;
import lab2.task3.model.Account;
import lab2.task3.model.CheckingAccount;
import lab2.task3.model.SavingsAccount;

public class BankTest {
    public static void main(String[] args) {
        Bank myBank = new Bank();


        //Creating new Accounts and adding them to the vector
        Account basic = new Account(101);
        SavingsAccount savings = new SavingsAccount(102, 0.10);
        CheckingAccount checking = new CheckingAccount(103);

        myBank.openAccount(basic);
        myBank.openAccount(savings);
        myBank.openAccount(checking);


        savings.deposit(1000);

        //operations with transactions number to get debutFee();
        checking.deposit(500);
        checking.deposit(100);
        checking.deposit(50);
        checking.deposit(200);
        checking.withDrawl(10);


        System.out.println("BEFORE : ");
        myBank.displayAccounts();
        myBank.update();

        //Updates :
        System.out.println("AFTER updating : ");
        myBank.displayAccounts();


        //CHECKIMG transfers
        System.out.println("\nTest transfers ");
        basic.deposit(500);
        basic.transfer(200, savings);
        basic.print();
        savings.print();

    }
}
