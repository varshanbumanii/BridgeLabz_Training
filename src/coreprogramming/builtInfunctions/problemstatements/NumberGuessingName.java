package core_programming.builtInfunctions.problemstatements;
import java.util.Scanner;
import java.util.Random;
public class NumberGuessingName {
    static int generateGuess(int low, int high) {
    return new Random().nextInt(high - low + 1) + low;
}

    static String getFeedback(Scanner sc) {
        return sc.nextLine().toLowerCase();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        boolean correct = false;

        System.out.println("Think of a number between 1 and 100");

        while (!correct) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guess: " + guess);
            System.out.print("Enter feedback (high / low / correct): ");

            String feedback = getFeedback(sc);

            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("correct")) {
                System.out.println("Computer guessed correctly!");
                correct = true;
            }
        }
        sc.close();
    }
}
