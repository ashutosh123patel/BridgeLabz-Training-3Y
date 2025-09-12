
class Book {

    private static String libraryTitle;
    private String bookName;
    private String writerName;
    private final String uniqueCode;

    public Book(String bookName, String writerName, String uniqueCode) {
        this.bookName = bookName;
        this.writerName = writerName;
        this.uniqueCode = uniqueCode;
    }

    public static void setLibraryTitle(String title) {
        libraryTitle = title;
    }

    public static void displayLibraryTitle() {
        System.out.println("Library Title: " + libraryTitle);
    }

    public void showBookInfo() {
        if (this instanceof Book) {
            System.out.println("Book Name: " + bookName);
            System.out.println("Writer Name: " + writerName);
            System.out.println("Unique Code: " + uniqueCode);
        } else {
            System.out.println("Object is not an instance of Book class.");
        }
    }

    public String getBookName() {
        return bookName;
    }

    public String getWriterName() {
        return writerName;
    }

    public String getUniqueCode() {
        return uniqueCode;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book.setLibraryTitle("City Central Library");
        Book.displayLibraryTitle();
        Book novel1 = new Book("Clean Code", "Robert C. Martin", "CC-9780132350884");
        novel1.showBookInfo();
    }
}
