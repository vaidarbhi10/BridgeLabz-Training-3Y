import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int ageA = sc.nextInt();
        System.out.print("Enter height of Amar: ");
        int heightA = sc.nextInt();

        System.out.print("Enter age of Akbar: ");
        int ageB = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        int heightB = sc.nextInt();

        System.out.print("Enter age of Anthony: ");
        int ageC = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        int heightC = sc.nextInt();

        // Youngest
        if (ageA < ageB && ageA < ageC)
            System.out.println("Youngest: Amar");
        else if (ageB < ageC)
            System.out.println("Youngest: Akbar");
        else
            System.out.println("Youngest: Anthony");

        // Tallest
        if (heightA > heightB && heightA > heightC)
            System.out.println("Tallest: Amar");
        else if (heightB > heightC)
            System.out.println("Tallest: Akbar");
        else
            System.out.println("Tallest: Anthony");
    }
}
