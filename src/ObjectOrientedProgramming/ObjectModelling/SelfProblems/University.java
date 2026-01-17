package objectorientedprogramming.ObjectModelling.SelfProblems;

import java.util.ArrayList;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}

class Department {
    String name;

    Department(String name) {
        this.name = name;
    }
}

class University {
    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    void closeUniversity() {
        departments.clear();
        System.out.println("University closed. Departments deleted.");
    }


    public static void main(String[] args) {
        University u = new University();
        u.departments.add(new Department("CSE"));
        u.faculties.add(new Faculty("Dr. Kumar"));

        u.closeUniversity();
    }
}

