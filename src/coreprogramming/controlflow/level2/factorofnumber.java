package coreprogramming.controlflow.level2;

import java.util.Scanner;

public class FactorofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=0) {
			System.out.println("Enter a positive number !");
			sc.close();
			return;
		}
		else {
			System.out.println("The Factors of "+n+" are : ");
			for(int i=1;i<n+1;i++) {
				if(n%i==0) {
					System.out.print(i+" ");
				}
			}
		}
		sc.close();
		

	}

}
