package coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class ChocoCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int noof = sc.nextInt();
		int nochi = sc.nextInt();
		System.out.println("No of chocolates per children : "+(noof/nochi)+" and Remaining chocolates : "+(noof%nochi));
		sc.close();

	}

}
