package coreprogramming.controlflow.level1;
import java.util.Scanner;
public class CountDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Take user input for countdown start
        System.out.print("Enter countdown value: ");
        int counter = sc.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        System.out.println("Launch!");

        sc.close();

	}

}
