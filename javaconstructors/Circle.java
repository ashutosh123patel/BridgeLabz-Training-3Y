package javaconstructors;

public class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // calls the parameterized constructor with default radius
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to display radius
    public void display() {
        System.out.println("Radius: " + radius);
    }

    // Main method to test constructors
    public static void main(String[] args) {
        // Using default constructor
        Circle c1 = new Circle();
        c1.display();

        // Using parameterized constructor
        Circle c2 = new Circle(5.0);
        c2.display();
    }
}
