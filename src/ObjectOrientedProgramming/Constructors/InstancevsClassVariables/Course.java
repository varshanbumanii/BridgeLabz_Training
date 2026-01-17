package objectorientedprogramming.Constructors.InstancevsClassVariables;

class Course {

    String courseName;
    int duration;
    static double fee;
    static String instituteName = "BridgeLabz";

    Course(String name, int d, double f) {
        courseName = name;
        duration = d;
        fee = f;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    static void updateInstituteName(String newName, double newFee) {
        instituteName = newName;
        fee = fee+newFee;
    }

    public static void main(String[] args) {

        Course c1 = new Course("Java", 6, 25000);
        Course c2 = new Course("Python", 4, 20000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("CodeTantra",3200);

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}

