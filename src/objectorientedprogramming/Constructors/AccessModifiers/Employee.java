package objectorientedprogramming.constructors.accessmodifiers;

class Employee {

    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double s) {
        salary = s;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {

    void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.employeeID = 501;
        m.department = "IT";
        m.setSalary(75000);

        m.displayDetails();
    }
}

