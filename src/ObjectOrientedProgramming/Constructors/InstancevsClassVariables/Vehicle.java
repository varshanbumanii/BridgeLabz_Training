package ObjectOrientedProgramming.Constructors.InstancevsClassVariables;

class Vehicle {

    String ownerName;
    String vehicleType;
    static double registrationFee = 5000;

    Vehicle(String owner, String type) {
        ownerName = owner;
        vehicleType = type;
    }

    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Varsha", "Jeep");
        Vehicle v2 = new Vehicle("Rahul", "Scooty");
        System.out.println("Vehicle Details:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(6000);
        System.out.println("Vehicle Details after updateRegistrationFee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

