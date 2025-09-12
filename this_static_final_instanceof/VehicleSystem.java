class Vehicle {

    private static double globalRegistrationFee = 100.0;
    private final String regNumber;
    private String owner;
    private String type;

    public Vehicle(String owner, String type, String regNumber) {
        this.owner = owner;
        this.type = type;
        this.regNumber = regNumber;
    }

    public static void setRegistrationFee(double fee) {
        if (fee >= 0.0) {
            globalRegistrationFee = fee;
        } else {
            System.out.println("Invalid registration fee. Must be non-negative.");
        }
    }

    public void showRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + owner);
            System.out.println("Vehicle Type: " + type);
            System.out.println("Registration Number: " + regNumber);
            System.out.println("Registration Fee: $" + globalRegistrationFee);
        } else {
            System.out.println("Not an instance of Vehicle class.");
        }
    }

    public String getOwner() {
        return owner;
    }

    public String getType() {
        return type;
    }

    public String getRegNumber() {
        return regNumber;
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle.setRegistrationFee(150.0);
        Vehicle car1 = new Vehicle("Honest Raj", "Sedan", "REG123");
        Vehicle car2 = new Vehicle("Price Danish", "SUV", "REG456");

        car1.showRegistrationDetails();
        System.out.println();
        car2.showRegistrationDetails();
    }
}
