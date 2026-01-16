package core_programming.javastring.level2;
import java.util.Scanner;
public class rockpaperscissor {
    static String[] choices = {"Rock", "Paper", "Scissors"};

    public static String computerChoice() {
        return choices[(int)(Math.random() * 3)];
    }

    public static int winner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if ((user.equals("Rock") && comp.equals("Scissors")) ||
                (user.equals("Paper") && comp.equals("Rock")) ||
                (user.equals("Scissors") && comp.equals("Paper")))
            return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();

        int userWin = 0, compWin = 0;

        for (int i = 0; i < games; i++) {
            String user = choices[(int)(Math.random() * 3)];
            String comp = computerChoice();

            int res = winner(user, comp);
            if (res == 1) userWin++;
            else if (res == -1) compWin++;
        }

        System.out.println("User Wins: " + userWin);
        System.out.println("Computer Wins: " + compWin);
        System.out.println("User Win %: " + (userWin * 100.0 / games));
    }
}
