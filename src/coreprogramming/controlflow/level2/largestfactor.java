package core_programming.controlflow.level2;

import java.util.Scanner;

public class largestfactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=0) {
			System.out.println("Enter a positive number ! ");
			sc.close();
			return;
		}
		int gf = 1;
		for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) {
                gf = i;
                break;
            }
        }
		System.out.println("Greatest Factor : "+gf);
		sc.close();

	}

}
