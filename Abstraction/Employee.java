package Abstraction;

import java.util.*;

abstract class mainEmployee {
    String name;
    int age;

    public mainEmployee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract int calculateSalary();

}

class empDetails extends mainEmployee {
    int sal;
    int bonus;

    public empDetails(String name, int age, int sal, int bonus) {
        super(name, age);
        this.sal = sal;
        this.bonus = bonus;

    }

    public int calculateSalary() {
        int salary = bonus + sal;
        return salary;

    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the employee");
        String name = sc.nextLine();
        System.out.println("Enter the age of the employee:");
        int age = sc.nextInt();
        System.out.println("enter the bonus of the employee:");
        int bonus = sc.nextInt();
        System.out.println("Enter the salary of the employee:");
        int salary = sc.nextInt();

        empDetails obj = new empDetails(name, age, salary, bonus);
        System.out.println("The salary of the employee  " + obj.name + " of age " + obj.age + "  is "
                + obj.calculateSalary());
        sc.close();

    }

}
