package model;

import java.util.StringJoiner;

public class Employee extends Person {

    public static final double TAX = 0.13;
    private double salary;

    public Employee() {
    }

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public double income() {
        double result = 0.0;
        result = (1 - TAX) * salary;
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", salary=" + salary +
                ", income=" + income() +
                '}';
    }
}