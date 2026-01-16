package coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class SwapNumb {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		a = a+b;
		b= a-b;
		a = a -b;
		System.out.println("The swapped numbers are "+a+" and "+b);
		sc.close();
	}

}
