package objectorientedprogramming.ObjectModelling.SelfProblems;

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        System.out.println("Doctor " + name + " consulting " + p.name);
    }

    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Smith");
        Patient p = new Patient("John");

        d.consult(p);
    }
}
