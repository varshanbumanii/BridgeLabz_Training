package coreprogramming.programmingelements.level1;

import java.util.Scanner;

public class TotalPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float unitprice = sc.nextFloat();
		int quantity = sc.nextInt();
		double tots = unitprice * quantity;
		System.out.println("Total Price: "+tots);
		sc.close();
		

	}

}
