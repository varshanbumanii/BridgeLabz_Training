package core_programming.controlflow.level3;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year<1582) {
			System.out.println("Year is not Valid !");
			sc.close();
			return;
		}
		if(year%400==0) {
			System.out.println("It is a Leap Year !");
		}
		else if(year%100 == 0) {
			System.out.println("It is not a Leap Year !");
		}
		else if(year % 4 ==0 ) {
			System.out.println("It is a Leap Year !");
		}
		else {
			System.out.println("It is not a Leap Year");
		}
		sc.close();

	}

}
