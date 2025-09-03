import java.util.Scanner;

public class CompareStrings {
    // Method to compare strings using charAt()
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Comparing using user-defined method
        boolean result1 = compareStrings(str1, str2);
        // Comparing using equals()
        boolean result2 = str1.equals(str2);

        System.out.println("Comparison using charAt(): " + result1);
        System.out.println("Comparison using equals(): " + result2);
        System.out.println("Are both results same? " + (result1 == result2));
    }
}
