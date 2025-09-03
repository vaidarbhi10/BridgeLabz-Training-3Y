public class Multiplication6to9 {
    public static void main(String[] args) {
        int[][] tables = new int[4][10]; // 4 numbers (6 to 9), 10 multiples each

        for (int num = 6; num <= 9; num++) {
            for (int i = 1; i <= 10; i++) {
                tables[num - 6][i - 1] = num * i;
            }
        }

        // Display
        for (int num = 6; num <= 9; num++) {
            System.out.println("\nMultiplication Table of " + num);
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + tables[num - 6][i - 1]);
            }
        }
    }
}
