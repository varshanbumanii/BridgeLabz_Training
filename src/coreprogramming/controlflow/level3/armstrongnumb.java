package core_programming.controlflow.level3;
import java.util.Scanner;
public class armstrongnumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int og = n;
		int sum = 0;
		while(og!=0) {
			int digit = og%10;
			sum+=digit*digit*digit;
			og=og/10;
		}
		if (sum == n) {
            System.out.println(n + " is an Armstrong Number");
        } else {
            System.out.println(n + " is NOT an Armstrong Number");
        }

        sc.close();

	}

}
