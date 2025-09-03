import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;

        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 24.9) status = "Normal";
        else if (bmi < 29.9) status = "Overweight";
        else status = "Obese";

        return new String[]{String.format("%.2f", bmi), status};
    }

    // Method to prepare BMI result for all persons
    public static String[][] computeBMI(double[][] data) {
        String[][] result = new String[data.length][4]; // weight, height, bmi, status
        for (int i = 0; i < data.length; i++) {
            result[i][0] = String.valueOf(data[i][0]); // weight
            result[i][1] = String.valueOf(data[i][1]); // height
            String[] bmiStatus = calculateBMI(data[i][0], data[i][1]);
            result[i][2] = bmiStatus[0]; // BMI
            result[i][3] = bmiStatus[1]; // Status
        }
        return result;
    }

    // Display in tabular form
    public static void display(String[][] arr) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (String[] row : arr) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] persons = new double[10][2]; // [weight, height]

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            persons[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            persons[i][1] = sc.nextDouble();
        }

        String[][] result = computeBMI(persons);
        display(result);
    }
}
