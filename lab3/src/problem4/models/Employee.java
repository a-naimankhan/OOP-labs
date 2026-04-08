package problem4.models;

import java.util.Date;

public class Employee  extends Person implements Comparable<Employee> {
    private double salary;
    private Date hireDate;
    private String insuranceNumber;

    public Employee(String name , double salary , Date hireDate , String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate =  hireDate;
        this.insuranceNumber = insuranceNumber;
    }


    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "\nsalary : " + getSalary() + "\nhired on : " + getHireDate() + "\ninsurance number : " + getInsuranceNumber();
    }


    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.salary, salary) != 0) return false;

        return java.util.Objects.equals(hireDate, ((Employee) o).hireDate)
                && java.util.Objects.equals(insuranceNumber, employee.insuranceNumber);
    }

    @Override
    public int compareTo(Employee other) {
        if (this.salary < other.salary) return -1;
        if (this.salary > other.salary) return 1;
        return 0;
    }
}
