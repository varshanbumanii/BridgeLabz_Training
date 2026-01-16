package coreprogramming.programmingelements.level1;

import java.util.Scanner;

public class NoofHandShake {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int combo = (n*(n-1))/2;
		System.out.println("No of Handshake possible: "+combo);
		sc.close();
	}

}
