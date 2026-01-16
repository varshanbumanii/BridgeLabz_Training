package coreprogramming.controlflow.level3;
import java.util.Scanner;
public class AbundantNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }

        int sum = 0;

        // Find sum of proper divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if abundant
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is NOT an Abundant Number");
        }

        sc.close();

	}

}
