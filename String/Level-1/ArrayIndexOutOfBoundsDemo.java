import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    static void generateException(String[] names) {
        System.out.println(names[names.length]); // Invalid index
    }

    static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Alice", "Bob", "Charlie"};

        // generateException(names); // Uncomment to crash
        handleException(names);
    }
}
