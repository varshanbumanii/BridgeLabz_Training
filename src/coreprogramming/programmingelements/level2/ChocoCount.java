package coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class ChocoCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no_of = sc.nextInt();
		int no_chi = sc.nextInt();
		System.out.println("No of chocolates per children : "+(no_of/no_chi)+" and Remaining chocolates : "+(no_of%no_chi));
		sc.close();

	}

}
