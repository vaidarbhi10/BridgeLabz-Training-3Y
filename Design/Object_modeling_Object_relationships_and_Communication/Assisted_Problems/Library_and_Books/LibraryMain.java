public class LibraryMain {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("The Hobbit", "J.R.R. Tolkien");
        Library lib1 = new Library();
        Library lib2 = new Library();
        lib1.addBook(b1);
        lib1.addBook(b2);
        lib2.addBook(b2);
        lib1.showBooks();
        lib2.showBooks();
    }
}
