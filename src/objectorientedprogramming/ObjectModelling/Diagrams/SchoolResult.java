package objectorientedprogramming.objectmodelling.diagrams;

import java.util.ArrayList;

class Subject {
    String name;
    int marks;

    Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Student {
    String name;
    ArrayList<Subject> subjects = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void addSubject(Subject subject) {
        subjects.add(subject);
    }
}

class GradeCalculator {

    void calculateGrade(Student student) {
        int total = 0;

        for (Subject s : student.subjects) {
            total += s.marks;
        }

        int average = total / student.subjects.size();

        System.out.println("Student Name: " + student.name);
        System.out.println("Average Marks: " + average);

        if (average >= 90)
            System.out.println("Grade: A");
        else if (average >= 75)
            System.out.println("Grade: B");
        else if (average >= 60)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: D");
    }
}

public class SchoolResult {
    public static void main(String[] args) {

        Student student = new Student("John");

        student.addSubject(new Subject("Maths", 90));
        student.addSubject(new Subject("Science", 85));

        GradeCalculator calculator = new GradeCalculator();
        calculator.calculateGrade(student);
    }
}

