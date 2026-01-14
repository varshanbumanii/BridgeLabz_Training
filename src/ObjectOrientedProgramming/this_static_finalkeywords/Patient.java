package ObjectOrientedProgramming.this_static_finalkeywords;

public class Patient {
    static String hospitalName = "SRM Global Hospital";
    static int totalPatients = 0;

    String name;
    int age;
    String ailment;
    final int patientID;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    void displayPatientDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient p = (Patient) obj;
            System.out.println("Hospital Name : " + hospitalName);
            System.out.println("Patient Name  : " + p.name);
            System.out.println("Age           : " + p.age);
            System.out.println("Ailment       : " + p.ailment);
            System.out.println("Patient ID    : " + p.patientID);
        } else {
            System.out.println("Invalid Patient Object");
        }
    }

    public static void main(String[] args) {

        Patient p1 = new Patient("Varsha", 21, "Fever", 401);
        Patient p2 = new Patient("Anbumani", 55, "Cold", 402);

        p1.displayPatientDetails(p1);
        p2.displayPatientDetails(p2);

        Patient.getTotalPatients();
    }
}
