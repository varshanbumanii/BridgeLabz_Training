package coreprogramming.controlflow.level2;

import java.util.Scanner;

public class PowerofN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pow = sc.nextInt();
		if(n<=1) {
			System.out.println("Enter a valid number !");
			sc.close();
			return;
		}
		int result = 1;

        for (int i = 1; i <= pow; i++) {
            result *= n;
        }

        // Output
        System.out.println(n + " ^ " + pow + " is: " + result);
        sc.close();

	}

}
