package coreprogramming.controlflow.level2;

import java.util.Scanner;

public class MultiplesWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=0 || n>=100) {
			System.out.println("Enter a valid number !");
			sc.close();
			return;
		}
		System.out.println("Multiples : ");
		int counter = 100;

        while (counter >= 1) {
            if (counter % n == 0) {
                System.out.println(counter);
            }
            counter--;
        }

        sc.close();

	}

}
