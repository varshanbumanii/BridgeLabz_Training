package coreprogramming.controlflow.level1;

import java.util.Scanner;

public class SpringorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int d = sc.nextInt();
		if((m==3 && d>=20) || (m==4) || (m==5) || (m==6 && d<=20)) {
			System.out.println("Spring Season");
		}
		else {
			System.out.println("Not a Spring Season");
		}
		sc.close();

	}

}
