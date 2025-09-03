import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] phy = new int[n], chem = new int[n], math = new int[n];
        double[] percent = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics marks of student " + (i + 1) + ": ");
            phy[i] = sc.nextInt();
            System.out.print("Enter Chemistry marks of student " + (i + 1) + ": ");
            chem[i] = sc.nextInt();
            System.out.print("Enter Maths marks of student " + (i + 1) + ": ");
            math[i] = sc.nextInt();

            if (phy[i] < 0 || chem[i] < 0 || math[i] < 0) {
                System.out.println("Invalid marks. Try again.");
                i--;
                continue;
            }

            percent[i] = (phy[i] + chem[i] + math[i]) / 3.0;

            if (percent[i] >= 90) grade[i] = "A";
            else if (percent[i] >= 75) grade[i] = "B";
            else if (percent[i] >= 50) grade[i] = "C";
            else grade[i] = "D";
        }

        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                    " | Physics: " + phy[i] +
                    " | Chemistry: " + chem[i] +
                    " | Maths: " + math[i] +
                    " | Percentage: " + percent[i] +
                    " | Grade: " + grade[i]);
        }
    }
}
