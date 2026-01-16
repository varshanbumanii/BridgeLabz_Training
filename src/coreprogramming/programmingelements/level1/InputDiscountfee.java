package coreprogramming.programmingelements.level1;

import java.util.Scanner;

public class InputDiscountfee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double fee = sc.nextDouble();
		double rate = sc.nextDouble();
		double disc = (fee * rate)/100;
		double newfee = fee - disc;
		System.out.println("The discount amount is Rs "+disc+" and the total fee has now become Rs. "+newfee);
		sc.close();

	}

}
