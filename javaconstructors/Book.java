package javaconstructors;
public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        Book b1 = new Book();
        b1.displayBook();
        Book b2 = new Book("The Alchemist", "Paulo Coelho", 499.99);
        b2.displayBook();
    }
}
