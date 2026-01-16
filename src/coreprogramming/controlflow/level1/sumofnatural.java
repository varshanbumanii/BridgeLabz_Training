package core_programming.controlflow.level1;

import java.util.Scanner;

public class sumofnatural {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		for(int i=0;i<n+1;i++) {
			sum = i*(i+1)/2;
		}
		System.out.println("Sum of "+n+" natural nnumbers is "+sum);
		sc.close();
	}

}
