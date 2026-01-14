package ObjectOrientedProgramming.Constructors.Level1;

class CarRental {

    String customerName;
    String carModel;
    int rentalDays;
    double pricePerDay = 1000;

    CarRental() {
        customerName = "Customer";
        carModel = "Car";
        rentalDays = 1;
    }

    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    double totalCost() {
        return rentalDays * pricePerDay;
    }

    void display() {
        System.out.println(customerName + ", " + carModel + ", Total Cost: " + totalCost());
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Varsha", "Hyundai", 5);

        r1.display();
        r2.display();
    }
}

