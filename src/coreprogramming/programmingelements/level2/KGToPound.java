package coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class KGToPound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float kg = sc.nextFloat();
		double pound = kg*2.2;
		System.out.println(kg+"Kg to "+pound+" Pounds");
		sc.close();

	}

}
