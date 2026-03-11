package lab2.task3.logic;

import lab2.task3.model.Account;
import lab2.task3.model.CheckingAccount;
import lab2.task3.model.SavingsAccount;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    public Bank() {
        this.accounts = new Vector<>();
    }

    public void openAccount(Account acc) {
        accounts.add(acc);
    }

    public void closeAccount(Account acc) {
        accounts.remove(acc);
    }

    public void update() {
        for (Account acc : accounts) {

            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).addInterest();
//                System.out.println("Added procents  : ");
            }

            else if (acc instanceof CheckingAccount) {
                ((CheckingAccount) acc).deductFee();
            }
        }
    }

    public void displayAccounts() {
        for (Account account : accounts) {
            account.print();
            System.out.println();
        }

    }

}
