package core_programming.controlflow.level2;

import java.util.Scanner;

public class fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%3==0) {
			for(int i=1;i<n+1;i++) {
				System.out.println("Fizz");
			}
		}
		else if(n%5==0) {
			for(int i = 1; i<n+1;i++) {
				System.out.println("Buzz");
			}
		}
		else {
			System.out.println("Not a multiple of 3 or 5");
		}
		sc.close();

	}

}
