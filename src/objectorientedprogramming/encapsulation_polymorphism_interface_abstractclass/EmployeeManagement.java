package objectorientedprogramming.encapsulation_polymorphism_interface_abstractclass;

import java.util.ArrayList;

interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    protected String department;

    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();


    public void displayDetails() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee implements Department {

    FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double calculateSalary() {
        return getBaseSalary();
    }

    @Override
    public void assignDepartment(String deptName) {
        department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

// -------- Part Time Employee --------
class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;

    PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void assignDepartment(String deptName) {
        department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(101, "Varsha", 60000);
        Employee e2 = new PartTimeEmployee(102, "Rahul", 500, 40);

        ((Department) e1).assignDepartment("IT");
        ((Department) e2).assignDepartment("Support");

        employees.add(e1);
        employees.add(e2);

        for (Employee emp : employees) {
            System.out.println("---- Employee Details ----");
            emp.displayDetails();
            System.out.println();
        }
    }
}

