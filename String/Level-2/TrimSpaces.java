import java.util.Scanner;

public class TrimSpaces {
    public static int[] findTrimIndexes(String str) {
        int start = 0, end = str.length() - 1;
        while (start < str.length() && str.charAt(start) == ' ') start++;
        while (end >= 0 && str.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] indexes = findTrimIndexes(text);
        String custom = customSubstring(text, indexes[0], indexes[1]);
        String builtin = text.trim();

        System.out.println("Custom Trim: '" + custom + "'");
        System.out.println("Built-in Trim: '" + builtin + "'");
        System.out.println("Are both same? " + compareStrings(custom, builtin));
        sc.close();
    }
}
