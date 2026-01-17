package objectorientedprogramming.this_static_finalkeywords;
import java.util.Scanner;
public class Vehicle {
    static double registrationFee = 5500.0;

    String ownerName;
    String vehicleType;
    final String registrationNumber;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = registrationFee-(registrationFee*(newFee/100));
    }

    void displayVehicleDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle v = (Vehicle) obj;
            System.out.println("Owner Name          : " + v.ownerName);
            System.out.println("Vehicle Type        : " + v.vehicleType);
            System.out.println("Registration Number : " + v.registrationNumber);
            System.out.println("Registration Fee    : " + registrationFee);
        } else {
            System.out.println("Invalid Vehicle Object");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name :");
        String name = sc.nextLine();
        System.out.print("Enter Type :");
        String type = sc.nextLine();
        System.out.print("Enter Registration Number :");
        String number = sc.nextLine();
        Vehicle v1 = new Vehicle(name, type, number);

        v1.displayVehicleDetails(v1);
        System.out.print("Enter Discount % :");
        double discount = sc.nextDouble();

        Vehicle.updateRegistrationFee(discount);

        System.out.println("\nAfter Applying Discount, the Registration Fee:\n");
        v1.displayVehicleDetails(v1);
    }
}
