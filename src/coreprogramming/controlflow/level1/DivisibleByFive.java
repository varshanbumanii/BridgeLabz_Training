package core_programming.controlflow.level1;

import java.util.Scanner;

public class DivisibleByFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%5==0) {
			System.out.println(n+" is divisible by 5");
		}
		else {
			System.out.println(n+" is not divisible by 5");
		}
		sc.close();

	}

}
