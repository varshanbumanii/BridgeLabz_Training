package objectorientedprogramming.inheritance.hybridlevel;

interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void displayDetails() {
        System.out.println("Model     : " + model);
        System.out.println("Max Speed : " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {

    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println("Charging the electric vehicle");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle");
    }
}

public class VehicleHybrid {
    public static void main(String[] args) {

        Vehicle ev = new ElectricVehicle(150, "Tesla Model 3");
        Vehicle pv = new PetrolVehicle(180, "Honda City");

        System.out.println("---- Electric Vehicle ----");
        ev.displayDetails();
        ((ElectricVehicle) ev).charge();

        System.out.println("\n---- Petrol Vehicle ----");
        pv.displayDetails();
        ((Refuelable) pv).refuel();
    }
}

