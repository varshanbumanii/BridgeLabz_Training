package core_programming.controlflow.level1;

import java.util.Scanner;

public class forloopcountdown {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=n;i>=1;i--) {
			System.out.println(i);
		}
		sc.close();

	}

}
