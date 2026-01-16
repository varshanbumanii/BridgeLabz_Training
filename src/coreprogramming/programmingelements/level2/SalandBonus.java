package coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class SalandBonus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float sal = sc.nextFloat();
		float bonus = sc.nextFloat();
		System.out.println("The Salary is Rs. "+sal+" and the Bonus is Rs. "+bonus+" which gives a total of Rs. "+(sal+bonus));
		sc.close();
	}

}
