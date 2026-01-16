package core_programming.controlflow.level3;

import java.util.Scanner;

public class avggrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Physics, Chemistry, and Math Marks : ");
		double maths = sc.nextDouble();
		double chems = sc.nextDouble();
		double math = sc.nextDouble();
		double avg = (maths+chems+math)/3;
		System.out.println("Average: "+avg);
		if(avg>=80) {
			System.out.println("Grade A, above agency-normalized standards");
		}
		else if(avg>=70 && avg<80) {
			System.out.println("Grade B, at agency-normalized standards");
		}
		else if(avg>=60 && avg<70) {
			System.out.println("Grade C, below but approaching agency-normalized standards");
		}
		else if(avg>=50 && avg<60) {
			System.out.println("Grade D, well below agency-normalized standards");
		}
		else if(avg>=40 && avg<50) {
			System.out.println("Grade E, too below agency-normalized standards");
		}
		else {
			System.out.println("Grade F, Remedial standards");
		}
		sc.close();

	}

}
