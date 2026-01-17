package objectorientedprogramming.ObjectModelling.SelfProblems;

import java.util.ArrayList;

class Course {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course c) {
        courses.add(c);
        c.students.add(this);
    }
}

class School {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        School s = new School("SRM School");
        Student st = new Student("Varsha");
        Course c = new Course("Maths");
        Course m = new Course("English");

        st.enrollCourse(c);
        s.students.add(st);

        System.out.println(st.name + " enrolled in " + c.name+" and "+m.name);
    }
}

