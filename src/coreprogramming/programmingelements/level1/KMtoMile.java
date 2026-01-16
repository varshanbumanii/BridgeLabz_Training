package coreprogramming.programmingelements.level1;

import java.util.Scanner;

public class KMtoMile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double km= sc.nextDouble();
		double mile = km/1.6;
		System.out.println("Kms: "+km+" Miles: "+mile);
		sc.close();

	}

}
