package core_programming.programmingelements.level1;

import java.util.Scanner;

public class areaoftriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double b = sc.nextDouble();
		double h = sc.nextDouble();
		double area = b*h*0.5;
		double inch = area / 2.54;
		int f = (int) inch/12;
		double remains = inch%12;
		System.out.println("Area in cms: "+area+" Area in "+f+" feet and "+remains+" inches.");
		sc.close();
		
		
	}
}
