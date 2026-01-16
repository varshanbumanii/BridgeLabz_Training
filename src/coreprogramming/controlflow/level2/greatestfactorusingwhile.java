package core_programming.controlflow.level2;

import java.util.Scanner;

public class greatestfactorusingwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=1) {
			System.out.println("Enter a Positive Number !");
			sc.close();
			return;
		}
		int gf = 1;
		int counter = n-1;
		while(counter>=1) {
			if(n%counter==0) {
				gf = counter;
				break;
			}
			counter--;
		}
		System.out.println("Greatest Factor using While : "+gf);
		sc.close();
	}
}
