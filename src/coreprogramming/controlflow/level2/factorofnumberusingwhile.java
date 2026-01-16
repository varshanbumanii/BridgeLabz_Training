package core_programming.controlflow.level2;

import java.util.Scanner;

public class factorofnumberusingwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int n = sc.nextInt();
		if(n<=0) {
			System.out.println("Enter a positive number !");
			sc.close();
			return;
		}
		System.out.println("The Factors of "+n+" are : ");
		while(i<n+1) {
			if(n%i==0) {
				System.out.print(i+" ");
				}
			i++;
			}
		sc.close();

	}

}
