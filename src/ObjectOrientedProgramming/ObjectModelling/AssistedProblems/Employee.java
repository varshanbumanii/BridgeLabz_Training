package objectorientedprogramming.objectmodelling.assistedproblems;
import java.util.ArrayList;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }
}

class Company {
    String name;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String name) {
        this.name = name;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void closeCompany() {
        departments.clear();
        System.out.println("Company closed. All departments removed.");
    }

    public static void main(String[] args) {
        Company c = new Company("Capgemini");
        Department d = new Department("IT");
        d.addEmployee(new Employee("Rahul"));
        c.addDepartment(d);

        c.closeCompany();
    }
}

