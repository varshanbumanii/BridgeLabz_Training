package coreprogramming.programmingelements.level2;


import java.util.Scanner;

public class TriangleArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		float peri = (side1+side2+side3)/1000;
		float round = 5/peri;
		System.out.println("No of rounds needed to finish 5 kms: "+round);
		sc.close();
	}

}
