package objectorientedprogramming.classandobjects.level1;
import java.util.Scanner;
public class EmployeeDetails {
    String name;
    int id;
    double salary;
    void display() {
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Salary : " + salary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDetails emp = new EmployeeDetails();
        emp.name = sc.nextLine();
        emp.id = sc.nextInt();
        emp.salary = sc.nextDouble();
        emp.display();
    }
}
