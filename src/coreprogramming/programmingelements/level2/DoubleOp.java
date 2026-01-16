package coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class DoubleOp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 double a = sc.nextDouble();
		 double b = sc.nextDouble();
		 double c = sc.nextDouble();
		 System.out.println("A+B*C = "+(a+b*c));
		 System.out.println("A*B+C = "+(a*b+c));
		 System.out.println("C+A/B = "+(c+a/b));
		 System.out.println("A%B+C = "+(a%b+c));
		 sc.close();

	}

}
