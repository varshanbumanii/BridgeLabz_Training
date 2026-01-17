package objectorientedprogramming.Encapsulation_Polymorphism_Interface_AbstractClass;

import java.util.ArrayList;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class Vehicles {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    Vehicles(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = "Unknown";
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    protected String getLocation() {
        return currentLocation;
    }

    protected void setLocation(String location) {
        this.currentLocation = location;
    }

    abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Driver     : " + driverName);
        System.out.println("Rate/Km    : " + ratePerKm);
        System.out.println("Location   : " + currentLocation);
    }
}

class Cars extends Vehicles implements GPS {

    Cars(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    double calculateFare(double distance) {
        return getRatePerKm() * distance + 50;
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String location) {
        setLocation(location);
    }
}

class Bikes extends Vehicles implements GPS {

    Bikes(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String location) {
        setLocation(location);
    }
}

class Autos extends Vehicles implements GPS {

    Autos(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    double calculateFare(double distance) {
        return getRatePerKm() * distance + 20;
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String location) {
        setLocation(location);
    }
}

public class RideHailing {

    static void calculateRideFare(Vehicles vehicle, double distance) {
        vehicle.getVehicleDetails();
        double fare = vehicle.calculateFare(distance);
        System.out.println("Distance   : " + distance + " km");
        System.out.println("Total Fare : " + fare);
        System.out.println();
    }

    public static void main(String[] args) {

        ArrayList<Vehicles> rides = new ArrayList<>();

        Vehicles v1 = new Cars("CAR101", "Arjun", 15);
        Vehicles v2 = new Bikes("BIKE202", "Ravi", 8);
        Vehicles v3 = new Autos("AUTO303", "Kumar", 10);

        ((GPS) v1).updateLocation("Anna Nagar");
        ((GPS) v2).updateLocation("T Nagar");
        ((GPS) v3).updateLocation("Velachery");

        rides.add(v1);
        rides.add(v2);
        rides.add(v3);

        double distance = 10;

        for (Vehicles v : rides) {
            calculateRideFare(v, distance);
        }
    }
}


