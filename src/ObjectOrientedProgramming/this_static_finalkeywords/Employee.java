package objectorientedprogramming.this_static_finalkeywords;

public class Employee {
    static String companyName = "Capgemini";
    static int totalEmployees = 0;

    String name;
    final int id;
    String designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayEmployeeDetails(Object obj) {
        if (obj instanceof Employee) {
            Employee emp = (Employee) obj;
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee Name: " + emp.name);
            System.out.println("Employee ID: " + emp.id);
            System.out.println("Designation: " + emp.designation);
        } else {
            System.out.println("Invalid Employee Object");
        }
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Varsha", 101, "Software Engineer");
        Employee e2 = new Employee("Rahul", 102, "Analyst");

        e1.displayEmployeeDetails(e1);
        e2.displayEmployeeDetails(e2);

        Employee.displayTotalEmployees();
    }
}
