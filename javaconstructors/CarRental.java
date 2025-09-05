package javaconstructors;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    public CarRental() {
        this("Unknown", "Standard", 1);
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        setDailyRate(carModel);
    }

    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.dailyRate = other.dailyRate;
    }

    private void setDailyRate(String carModel) {
        switch (carModel.toLowerCase()) {
            case "suv":
                dailyRate = 2500.0;
                break;
            case "sedan":
                dailyRate = 2000.0;
                break;
            case "hatchback":
                dailyRate = 1500.0;
                break;
            default:
                dailyRate = 1800.0; 
        }
    }

    public double calculateTotalCost() {
        return dailyRate * rentalDays;
    }

    public void displayDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: ₹" + dailyRate);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        CarRental booking1 = new CarRental("Ravi Kumar", "SUV", 5);
        booking1.displayDetails();
        CarRental booking2 = new CarRental();
        booking2.displayDetails();
        CarRental booking3 = new CarRental(booking1);
        booking3.displayDetails();
    }
}
