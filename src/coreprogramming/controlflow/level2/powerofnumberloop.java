package core_programming.controlflow.level2;

import java.util.Scanner;

public class powerofnumberloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pow = sc.nextInt();
		if(n<0 || pow<0) {
			System.out.println("Enter a valid Number! ");
			sc.close();
			return;
		}
		int r = 1;
        int count = 0;

        // While loop to calculate power
        while (count < pow) {
            r *= n;
            count++;
        }

        // Output
        System.out.println(n + " ^ " + pow + " is: " + r);
        sc.close();

	}

}
