package coreprogramming.controlflow.level1;

import java.util.Scanner;

public class WhileFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int tots=1;
		if(n<=0) {
			System.out.println("Not a Natural Number");
			sc.close();
			return;
		}
		else {
			while(i<n+1) {
			tots *=i;
			i++;
		}
		System.out.println("Factorial of "+n+" is "+tots);
		sc.close();
		}
	}

}
