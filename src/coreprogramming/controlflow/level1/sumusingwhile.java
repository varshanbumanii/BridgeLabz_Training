package core_programming.controlflow.level1;

import java.util.Scanner;

public class sumusingwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =0;
		int total=0;
		if(n<=0) {
			System.out.println("Not a Natrual Number ");
			sc.close();
			return;
		}
		else {
			while(i<n+1) {
				total += i;
				i++;
			}
			System.out.println("Sum of "+n+" Natural Numbers is "+total);
		}
		sc.close();
	

	}

}
