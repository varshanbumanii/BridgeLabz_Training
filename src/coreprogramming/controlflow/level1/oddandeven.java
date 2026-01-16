package core_programming.controlflow.level1;

import java.util.Scanner;

public class oddandeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		if(n<=0) {
			System.out.println("Not a Natural Number");
			sc.close();
			return;
		}
		else {
			while(i<n+1) {
				if(i%2!=0) {
					System.out.println(i+" is Odd");
				}
				else {
					System.out.println(i+" is Even");
				}
				i++;
			}
		}
		sc.close();
	}

}
