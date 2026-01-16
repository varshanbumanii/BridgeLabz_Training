package core_programming.controlflow.level1;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tots=1;
		for(int i =1;i<n+1;i++) {
			tots *=i;
		}
		System.out.println("Factorial of "+n+" is "+tots);
		sc.close();

	}

}
