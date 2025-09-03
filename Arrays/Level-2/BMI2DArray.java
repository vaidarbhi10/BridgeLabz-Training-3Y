import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // 0=weight,1=height,2=bmi
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            double w = sc.nextDouble();
            while (w <= 0) {
                System.out.print("Enter positive weight: ");
                w = sc.nextDouble();
            }

            System.out.print("Enter height (m) of person " + (i + 1) + ": ");
            double h = sc.nextDouble();
            while (h <= 0) {
                System.out.print("Enter positive height: ");
                h = sc.nextDouble();
            }

            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = w / (h * h);

            if (personData[i][2] < 18.5) status[i] = "Underweight";
            else if (personData[i][2] < 25) status[i] = "Normal";
            else if (personData[i][2] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " | Height: " + personData[i][1] + "m | Weight: " + personData[i][0] +
                    "kg | BMI: " + personData[i][2] + " | Status: " + status[i]);
        }
    }
}
