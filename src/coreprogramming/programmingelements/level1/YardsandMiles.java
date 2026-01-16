package coreprogramming.programmingelements.level1;

import java.util.Scanner;

public class YardsandMiles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int feet = sc.nextInt();
		double yard = feet/3;
		double mile = yard/1760;
		System.out.println(feet+" Feet is "+mile+" Miles and "+yard+" Yards.");
		sc.close();
	}

}
