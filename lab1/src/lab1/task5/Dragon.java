package lab1.task5;

import java.util.Stack;
import java.util.Vector;

public class Dragon {
    private Vector<Person> victims = new Vector<>();



    public void kidnap(Person p) {
        victims.add(p);
    }

    public boolean willDragonEat() {
        int balance = 0;

        for (Person p : victims) {
            if (p.gender == Gender.BOY) {
                balance++;
            } else {
                if(balance > 0) {
                    balance--;
                } else {
                    return true;
                }
            }
        }
        return balance != 0;
    }
}
