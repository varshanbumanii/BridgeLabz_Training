package ObjectOrientedProgramming.Encapsulation_Polymorphism_Interface_AbstractClass;

import java.util.ArrayList;

interface MedicalRecord {
    void addRecord(String diagnosis);
    void viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    // Sensitive data (encapsulated)
    private String medicalHistory;

    Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Encapsulation: getters only
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected void setMedicalHistory(String history) {
        this.medicalHistory = history;
    }

    protected String getMedicalHistory() {
        return medicalHistory;
    }

    // Abstract method
    abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID : " + patientId);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
    }
}
class InPatient extends Patient implements MedicalRecord {

    private int daysAdmitted;
    private double dailyCharge;

    InPatient(int id, String name, int age, int daysAdmitted, double dailyCharge) {
        super(id, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    @Override
    double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    @Override
    public void addRecord(String diagnosis) {
        setMedicalHistory(diagnosis);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History: " + getMedicalHistory());
    }
}

// -------- OutPatient --------
class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;

    OutPatient(int id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String diagnosis) {
        setMedicalHistory(diagnosis);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History: " + getMedicalHistory());
    }
}

public class HospitalManagement {
    public static void main(String[] args) {

        ArrayList<Patient> patients = new ArrayList<>();

        Patient p1 = new InPatient(101, "Varsha", 21, 5, 3000);
        Patient p2 = new OutPatient(102, "Rahul", 30, 800);

        ((MedicalRecord) p1).addRecord("Appendicitis - Surgery Done");
        ((MedicalRecord) p2).addRecord("Fever and Cold");

        patients.add(p1);
        patients.add(p2);

        for (Patient p : patients) {
            System.out.println("---- Patient Details ----");
            p.getPatientDetails();

            System.out.println("Bill Amount: " + p.calculateBill()); // Polymorphism

            ((MedicalRecord) p).viewRecords();
            System.out.println();
        }
    }
}

