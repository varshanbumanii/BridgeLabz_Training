package coreprogramming.controlflow.level1;

import java.util.Scanner;

public class SmallofThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b) {
			if(b>c) {
				System.out.println(c+" is the smallest number");
			}
			else {
				System.out.println(b+" is the smallest number");
			}
		}
		else if(b>a) {
			if(a>c) {
				System.out.println(c+" is the smallest number");
			}
			else {
				System.out.println(a+" is the smallest number");
			}
			}
			else {
				if(a>b) {
					System.out.println(a+" is the smallest number");
				}
				else {
					System.out.println(b+" is the smallest number");
				}

			}

		sc.close();

}}
