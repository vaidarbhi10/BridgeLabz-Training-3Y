import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(82) + 10; // 10 to 91
        }
        return ages;
    }

    public static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) result[i][1] = "False";
            else if (ages[i] >= 18) result[i][1] = "True";
            else result[i][1] = "False";
        }
        return result;
    }

    public static void display2D(String[][] arr) {
        System.out.println("Age\tCanVote");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);
        String[][] result = checkVoting(ages);

        display2D(result);
        sc.close();
    }
}
