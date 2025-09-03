import java.util.Scanner;
import java.util.Random;

public class StudentScorecard {
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(41) + 60; // Physics
            scores[i][1] = rand.nextInt(41) + 60; // Chemistry
            scores[i][2] = rand.nextInt(41) + 60; // Math
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = Math.round((total / 3.0) * 100.0 / 100.0);
            results[i][0] = total;
            results[i][1] = avg;
            results[i][2] = percent;
        }
        return results;
    }

    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double p = results[i][2];
            if (p >= 90) grades[i] = "A";
            else if (p >= 75) grades[i] = "B";
            else if (p >= 60) grades[i] = "C";
            else if (p >= 50) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t% \tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t" +
                               (int)results[i][0] + "\t" +
                               String.format("%.2f", results[i][1]) + "\t" +
                               String.format("%.2f", results[i][2]) + "\t" +
                               grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);

        displayScorecard(scores, results, grades);
        sc.close();
    }
}
