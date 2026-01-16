package core_programming.controlflow.level1;

import java.util.Scanner;

public class legalornot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("You are at the legal age to vote");
		}
		else{
			System.out.println("You are not the legal age to vote");
		}
		sc.close();
	}

}
