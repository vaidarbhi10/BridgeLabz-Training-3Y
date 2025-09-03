import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    static void generateException(String text) {
        System.out.println(text.charAt(text.length())); // Invalid index
    }

    static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        // generateException(text); // Uncomment to crash
        handleException(text);
    }
}
