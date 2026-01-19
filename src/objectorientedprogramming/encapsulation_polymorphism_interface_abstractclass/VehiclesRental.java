package objectorientedprogramming.encapsulation_polymorphism_interface_abstractclass;

import java.util.ArrayList;

// -------- Interface --------
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// -------- Abstract Class --------
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Encapsulation: getters only
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    // Abstract method
    abstract double calculateRentalCost(int days);

    // Concrete method
    void displayDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type   : " + type);
        System.out.println("Rental Rate   : " + rentalRate + " per day");
    }
}

// -------- Car --------
class Car extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + insurancePolicyNumber;
    }
}

// -------- Bike --------
class Bike extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.08;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + insurancePolicyNumber;
    }
}

// -------- Truck --------
class Truck extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    @Override
    double calculateRentalCost(int days) {
        return (getRentalRate() * days) + 2000; // extra heavy vehicle charge
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.25;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicyNumber;
    }
}

// -------- Main Class --------
public class VehicleRental {

    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("TN01AB1234", 2000, "CAR-INS-101"));
        vehicles.add(new Bike("TN02XY5678", 800, "BIKE-INS-202"));
        vehicles.add(new Truck("TN03TR9999", 5000, "TRUCK-INS-303"));

        int rentalDays = 3;

        for (Vehicle v : vehicles) {
            System.out.println("---- Vehicle Rental Details ----");
            v.displayDetails();

            double rent = v.calculateRentalCost(rentalDays);
            double insurance = ((Insurable) v).calculateInsurance();

            System.out.println("Rental Days  : " + rentalDays);
            System.out.println("Rental Cost : " + rent);
            System.out.println("Insurance   : " + insurance);
            System.out.println("Total Cost  : " + (rent + insurance));
            System.out.println(((Insurable) v).getInsuranceDetails());
            System.out.println();
        }
    }
}

