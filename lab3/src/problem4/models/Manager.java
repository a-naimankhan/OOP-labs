package problem4.models;

import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager(String name , double salary , java.util.Date hireDate , String insuranceNumber , double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.bonus = bonus;
        this.team = new Vector<>();
    }


    public void addToTeam(Employee e) {
        team.add(e);
    }

    @Override
    public int compareTo(Employee other) {
        int res = super.compareTo(other);


        if (res == 0 && other instanceof Manager) {
            Manager otherManager = (Manager) other;
            return Double.compare(this.bonus , otherManager.bonus);
        }

        return  res;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        Manager cloned = (Manager) super.clone();

        cloned.team = new Vector<>();
        for (Employee employee : this.team) {
            cloned.team.add(employee);
        }

        return cloned;
    }


    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Double.compare(manager.bonus, bonus) == 0 && Objects.equals(team,manager.team);
    }

    @Override
    public String toString() {
        return super.toString() + "\n Bonus : " + bonus + "\nTeam size : " + team.size();
    }
}
