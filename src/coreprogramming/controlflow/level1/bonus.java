package core_programming.controlflow.level1;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double sal = sc.nextDouble();
		int years = sc.nextInt();
		if(years<=5) {
			System.out.println("No Bonus!");
		}
		else {
			double bonus = sal*0.05;
			System.out.println("Salary Bonus: Rs. "+bonus);
		}
		sc.close();

	}

}
