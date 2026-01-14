package ObjectOrientedProgramming.Inheritance.HierarchialLevel;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayCommonDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role   : Teacher");
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role : Student");
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Role       : Staff");
        System.out.println("Department : " + department);
    }
}

public class SchoolSys {
    public static void main(String[] args) {

        Person[] people = new Person[3];
        people[0] = new Teacher("Mr. Rao", 45, "Mathematics");
        people[1] = new Student("Varsha", 21, "A");
        people[2] = new Staff("Ramesh", 38, "Administration");

        for (Person p : people) {
            System.out.println("---- Person Details ----");
            p.displayCommonDetails();

            if (p instanceof Teacher) {
                ((Teacher) p).displayRole();
            } else if (p instanceof Student) {
                ((Student) p).displayRole();
            } else if (p instanceof Staff) {
                ((Staff) p).displayRole();
            }

            System.out.println();
        }
    }
}
