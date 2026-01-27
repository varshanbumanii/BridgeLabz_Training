package javacollectionsandstreams.javagenerics;

import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public abstract String getEvaluationType();
}

class ExamCourse extends CourseType {
    public ExamCourse(String courseName) {
        super(courseName);
    }

    public String getEvaluationType() {
        return "Exam-Based";
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    public String getEvaluationType() {
        return "Assignment-Based";
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName) {
        super(courseName);
    }

    public String getEvaluationType() {
        return "Research-Based";
    }
}

class Course<T extends CourseType> {
    private T course;

    public Course(T course) {
        this.course = course;
    }

    public T getCourse() {
        return course;
    }
}

public class UniversityCourseApp {

    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course.getCourseName() + " - " + course.getEvaluationType());
        }
    }

    public static void main(String[] args) {

        List<CourseType> courseList = new ArrayList<>();

        courseList.add(new ExamCourse("Data Structures"));
        courseList.add(new AssignmentCourse("Software Engineering"));
        courseList.add(new ResearchCourse("Artificial Intelligence"));

        displayCourses(courseList);
    }
}

