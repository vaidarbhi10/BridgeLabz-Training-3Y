import java.util.Scanner;

public class ToUpperCaseExample {
    static String toUpperCaseCustom(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String custom = toUpperCaseCustom(text);
        String builtIn = text.toUpperCase();

        System.out.println("Custom uppercase: " + custom);
        System.out.println("Built-in uppercase: " + builtIn);
        System.out.println("Comparison result: " + compareStrings(custom, builtIn));
    }
}
