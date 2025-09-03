import java.util.Scanner;

public class SplitCompare {
    public static int findLength(String str) {
        int count = 0;
        try { while (true) { str.charAt(count); count++; } }
        catch (StringIndexOutOfBoundsException e) { return count; }
    }

    public static String[] customSplit(String text) {
        int len = findLength(text);
        int wordCount = 1;
        for (int i = 0; i < len; i++) if (text.charAt(i) == ' ') wordCount++;

        String[] words = new String[wordCount];
        int start = 0, index = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = text.substring(start);
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] custom = customSplit(text);
        String[] builtin = text.split(" ");

        System.out.println("Custom Split:");
        for (String w : custom) System.out.println(w);

        System.out.println("\nBuilt-in Split:");
        for (String w : builtin) System.out.println(w);

        System.out.println("\nAre both same? " + compareArrays(custom, builtin));
        sc.close();
    }
}
