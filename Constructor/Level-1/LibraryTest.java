class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title + ", Available: " + available);
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Java OOP", "Gosling", 600, true);
        b1.display();
        b1.borrowBook();
        b1.display();
    }
}
