
import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void getDetails() {
        System.out.println(title + " by " + author);
    }
}

class Library {
    String name;
    ArrayList<Book> books = new ArrayList<>();

    Library(String name) {
        this.name = name;
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        System.out.println("Books in " + name + ":");
        for (Book b : books) {
            b.getDetails();
        }
    }
}

public class LibraryApplication {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling");
        Book b2 = new Book("Python 101", "Guido van Rossum");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("University Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);

        lib1.showBooks();
        lib2.showBooks();
    }
}
