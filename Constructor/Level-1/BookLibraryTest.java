class Book {
    public String ISBN;      // Public
    protected String title;  // Protected
    private String author;   // Private

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter and Setter for private author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

// Subclass demonstrating access to public & protected members
class EBook extends Book {
    double fileSize;

    EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    void displayDetails() {
        System.out.println("ISBN: " + ISBN);   // public accessible
        System.out.println("Title: " + title); // protected accessible
        System.out.println("Author: " + getAuthor()); // via getter
        System.out.println("File Size: " + fileSize + " MB");
    }
}

public class BookLibraryTest {
    public static void main(String[] args) {
        EBook ebook = new EBook("12345", "Java Programming", "James Gosling", 5.2);
        ebook.displayDetails();

        ebook.setAuthor("Updated Author");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
