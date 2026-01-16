package core_programming.controlflow.level1;

import java.util.Scanner;

public class SumUsingFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a Natural Number");
            sc.close();
            return;
        }

        int total = 0;

        for (int i = 1; i <= n; i++) {
            total += i;
        }

        System.out.println("Sum of " + n + " Natural Numbers is " + total);
        sc.close();
	}

}
