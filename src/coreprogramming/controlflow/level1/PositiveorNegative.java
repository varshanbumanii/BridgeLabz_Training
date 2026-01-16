package coreprogramming.controlflow.level1;

import java.util.Scanner;

public class PositiveorNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>1) {
			System.out.println("Positive Number");
		}
		else if(n==0) {
			System.out.println("The Number is Zero");
		}
		else {
			System.out.println("Negative Number");
		}
		sc.close();

	}

}
