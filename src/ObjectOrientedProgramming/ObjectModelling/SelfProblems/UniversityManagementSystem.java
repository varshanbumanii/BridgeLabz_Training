package objectorientedprogramming.objectmodelling.selfproblems;

class UniCourse {
    String courseName;

    UniCourse(String courseName) {
        this.courseName = courseName;
    }
}

class UniStudent {
    String studentName;

    UniStudent(String studentName) {
        this.studentName = studentName;
    }

    void enrollCourse(UniCourse course) {
        System.out.println(studentName + " enrolled in " + course.courseName);
    }
}

class UniProfessor {
    String professorName;

    UniProfessor(String professorName) {
        this.professorName = professorName;
    }

    void assignProfessor(UniCourse course) {
        System.out.println(professorName + " assigned to teach " + course.courseName);
    }
}

public class UniversityManagementSystem {

    public static void main(String[] args) {

        UniCourse course = new UniCourse("Java Programming");
        UniStudent student = new UniStudent("Varsha");
        UniProfessor professor = new UniProfessor("Dr. Uma");

        student.enrollCourse(course);
        professor.assignProfessor(course);
    }
}

