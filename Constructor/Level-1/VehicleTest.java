class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ravi", "Car");
        v1.displayVehicleDetails();

        Vehicle.updateRegistrationFee(6000);
        Vehicle v2 = new Vehicle("Priya", "Bike");
        v2.displayVehicleDetails();
    }
}
