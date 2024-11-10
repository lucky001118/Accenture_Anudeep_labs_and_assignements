package com.labx2;

import java.util.Scanner;

public class Employee extends User{
    // Additional property for salary
    //it is a monthly salary
    double salary;

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Constructor to initialize id, name, and salary
    public Employee(int id, String name, double salary) {
        super(id, name); // Call the superclass constructor to initialize id and name
        this.salary = salary; // Initialize salary
    }

    // Method for calculate annual salary
    public double calculateAnnualSalary() {
        return salary * 12; // Monthly salary multiplied by 12 to get annual salary
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the id: ");
        int id = sc.nextInt();

        sc.nextLine(); // Consume the newline character after nextInt()

        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the monthly salary: ");
        double salary = sc.nextDouble();

        // Create an Employee object
        Employee emp = new Employee(id,name,salary);

        // Calculate the annual salary
        double annualSalary = emp.calculateAnnualSalary();

        // Display employee details and annual salary
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Monthly Salary: " + emp.getSalary());
        System.out.println("Annual Salary: " + annualSalary);
    }

}
