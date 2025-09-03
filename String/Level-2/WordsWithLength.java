import java.util.Scanner;

public class WordsWithLength {
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

    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[][] result = wordsWithLength(words);

        System.out.println("Word\tLength");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
        sc.close();
    }
}
