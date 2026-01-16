package coreprogramming.controlflow.level2;

import java.util.Scanner;

public class TallandOld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amar's Age and Height : ");
		int age1 = sc.nextInt();
		int h1 = sc.nextInt();
		System.out.println("Enter Akbar's Age and Height : ");
		int age2 = sc.nextInt();
		int h2 = sc.nextInt();
		System.out.println("Enter Anthony's Age and Height : ");
		int age3 = sc.nextInt();
		int h3=sc.nextInt();
		if(age1>age2) {
			if(age1>age3) {
				System.out.println("Amar is older");
			}
			else {
				System.out.println("Anthony is older");
			}
		}
		else if(age2>age3) {
			if(age2>age1) {
				System.out.println("Akbar is older");
			}
			else {
				System.out.println("Amar is older");
			}
		}
		else {
			if(age3>age1) {
				System.out.println("Anthony is older");
			}
			else {
				System.out.println("Amar is older");
			}
		}
		if(h1>h2) {
			if(h1>h3) {
				System.out.println("Amar is taller");
			}
			else {
				System.out.println("Anthony is taller");
			}
		}
		else if(h2>h1) {
			if(h2>h3) {
				System.out.println("Akbar is taller");
			}
			else {
				System.out.println("Anthony is taller");
			}
		}
		sc.close();
	}

}
