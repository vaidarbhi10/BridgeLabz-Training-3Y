class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        double ratePerDay = 1000.0;
        return rentalDays * ratePerDay;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

public class CarRentalTest {
    public static void main(String[] args) {
        CarRental r1 = new CarRental("Suresh", "Hyundai i20", 5);
        r1.display();
    }
}
