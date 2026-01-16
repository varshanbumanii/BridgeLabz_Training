package core_programming.programmingelements.level1;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1= sc.nextFloat();
		float n2= sc.nextFloat();
		System.out.println("Addition: "+(n1+n2));
		System.out.println("Subtraction: "+(n1-n2));
		System.out.println("Multiplication: "+(n1*n2));
		System.out.println("Divison: "+(n1/n2));
		sc.close();
	}

}
