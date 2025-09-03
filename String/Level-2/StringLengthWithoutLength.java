import java.util.Scanner;

public class StringLengthWithoutLength {
    
    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // will throw exception when index is out of bounds
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Built-in method
        int builtinLength = input.length();

        // User-defined method
        int customLength = findLength(input);

        // Display results
        System.out.println("Length using built-in method: " + builtinLength);
        System.out.println("Length using custom method: " + customLength);

        sc.close();
    }
}
