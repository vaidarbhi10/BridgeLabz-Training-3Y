import java.util.Scanner;

public class ShortestLongestWord {
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

    public static String[] findShortestLongest(String[] words) {
        String shortest = words[0], longest = words[0];
        for (String w : words) {
            if (findLength(w) < findLength(shortest)) shortest = w;
            if (findLength(w) > findLength(longest)) longest = w;
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[] res = findShortestLongest(words);

        System.out.println("Shortest word: " + res[0]);
        System.out.println("Longest word: " + res[1]);
        sc.close();
    }
}
