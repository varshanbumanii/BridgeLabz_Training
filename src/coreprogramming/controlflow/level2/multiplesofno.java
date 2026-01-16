package coreprogramming.controlflow.level2;

import java.util.Scanner;

public class MultiplesofNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=0 || n>=100) {
				System.out.println("Enter a Valid Number !");
				sc.close();
				return;
		}
		for (int i = 100; i >= 1; i--) {
            if (i % n == 0) {
                System.out.println(i);
            }
        }
		sc.close();
	}

}
