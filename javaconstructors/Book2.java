package javaconstructors;

public class Book2 {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public Book2(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, the book '" + title + "' is not available.");
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
    
        Book2 b1 = new Book2("The Alchemist", "Paulo Coelho", 499.99, true);
        Book2 b2 = new Book2("1984", "George Orwell", 399.99, false);
        b1.displayDetails();
        b2.displayDetails();
        b1.borrowBook();  
        b2.borrowBook();  
        b1.displayDetails();
        b2.displayDetails();
    }
}
