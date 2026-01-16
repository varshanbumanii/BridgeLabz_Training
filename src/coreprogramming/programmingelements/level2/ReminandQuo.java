package coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class ReminandQuo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int m=sc.nextInt();
		System.out.println("Quotient is "+(n/m)+" and Reminder is "+(n%m)+" for the numbers: "+n+" and "+m);
		sc.close();

	}

}
