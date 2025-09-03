import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "rock";
        if (choice == 1) return "paper";
        return "scissors";
    }

    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("scissors") && computer.equals("paper")) ||
            (user.equals("paper") && computer.equals("rock"))) {
            return "User";
        }
        return "Computer";
    }

    public static String[][] calculateStats(int userWins, int compWins, int games) {
        String[][] result = new String[2][3];
        result[0][0] = "User";
        result[0][1] = String.valueOf(userWins);
        result[0][2] = String.valueOf((userWins * 100.0) / games);

        result[1][0] = "Computer";
        result[1][1] = String.valueOf(compWins);
        result[1][2] = String.valueOf((compWins * 100.0) / games);
        return result;
    }

    public static void displayStats(String[][] stats) {
        System.out.println("Player\tWins\tWin%");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0, compWins = 0;
        for (int i = 0; i < games; i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = sc.next().toLowerCase();
            String computer = getComputerChoice();
            String winner = getWinner(user, computer);

            System.out.println("Computer chose: " + computer);
            System.out.println("Winner: " + winner);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
        }

        String[][] stats = calculateStats(userWins, compWins, games);
        displayStats(stats);
        sc.close();
    }
}
