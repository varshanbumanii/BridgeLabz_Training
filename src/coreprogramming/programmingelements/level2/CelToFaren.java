package coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class CelToFaren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double cel = sc.nextDouble();
		double faren = (cel*(9/5))+32;
		System.out.println("It is "+faren+" Farenheit and "+cel+" Celcius.");
		sc.close();
		

	}

}
