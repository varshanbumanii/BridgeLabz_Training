package ObjectOrientedProgramming.this_static_finalkeywords;

public class Student {
    static String universityName = "SRM University";
    static int totalStudents = 0;

    String name;
    final int rollNumber;
    String grade;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayStudentDetails(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            System.out.println("University Name: " + universityName);
            System.out.println("Student Name   : " + s.name);
            System.out.println("Roll Number    : " + s.rollNumber);
            System.out.println("Grade          : " + s.grade);
        } else {
            System.out.println("Invalid Student Object");
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student("Varsha", 20008, "O");
        Student s2 = new Student("Anish", 20044, "A+");

        s1.displayStudentDetails(s1);
        s2.displayStudentDetails(s2);

        Student.displayTotalStudents();
    }
}
