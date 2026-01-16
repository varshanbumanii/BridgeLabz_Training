package coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class FarenToCel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double faren = sc.nextDouble();
		double cel = (faren-32) * 5/9;
		System.out.println("It is "+faren+" Farenheit and "+cel+" Celcius.");
		sc.close();

	}

}
