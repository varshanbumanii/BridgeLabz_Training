package objectorientedprogramming.Inheritance.SingleLevel;

class Device {
    String deviceId;
    boolean status;

    Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(String deviceId, boolean status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus() {
        System.out.println("Device ID          : " + deviceId);
        System.out.println("Power Status       : " + (status ? "ON" : "OFF"));
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHome {
    public static void main(String[] args) {

        Thermostat t1 = new Thermostat("TH-101", true, 24);
        Thermostat t2 = new Thermostat("TH-102", false, 20);

        System.out.println("---- Thermostat 1 ----");
        t1.displayStatus();

        System.out.println("\n---- Thermostat 2 ----");
        t2.displayStatus();
    }
}

