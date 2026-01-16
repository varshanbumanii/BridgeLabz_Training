package coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class IntoOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int c = sc.nextInt();
		 System.out.println("A+B*C = "+(a+b*c));
		 System.out.println("A*B+C = "+(a*b+c));
		 System.out.println("C+A/B = "+(c+a/b));
		 System.out.println("A%B+C = "+(a%b+c));
		 sc.close();

	}

}
