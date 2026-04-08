package problem4.app;

import problem4.models.Chocolate;
import problem4.models.Employee;
import problem4.service.Sort;

import java.util.Date;

public class SortTest {

    //used AI tests
    public static void main(String[] args) {
        // 1. Тестим Шоколад
        Chocolate[] chocolates = {
                new Chocolate("Kazakhstan", 100),
                new Chocolate("Alenka", 90),
                new Chocolate("Mars", 50)
        };
        Sort.bubbleSort(chocolates);
        System.out.println("Sorted Chocolates: " + java.util.Arrays.toString(chocolates));

        // 2. Тестим Сотрудников (из Problem 4)
        Employee[] employees = {
                new Employee("Aibar", 500000, new Date(), "ID123"),
                new Employee("Beka", 300000, new Date(), "ID456"),
                new Employee("Damir", 700000, new Date(), "ID789")
        };
        Sort.bubbleSort(employees);
        System.out.println("Sorted Employees: " + java.util.Arrays.toString(employees));


        System.out.println("\nUsing methods from interfaces on lab2 models : ");

    }
}
