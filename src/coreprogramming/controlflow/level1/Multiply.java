package coreprogramming.controlflow.level1;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=6 && n<=9) {
			for(int i=1;i<13;i++) {
				System.out.println(n+" x "+i+" = "+(n*i));
			}
		}
		else {
			System.out.println("Invalid Input");
		}
		sc.close();
	}

}
