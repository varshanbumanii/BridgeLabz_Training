package core_programming.programmingelements.level2;

import java.util.Scanner;

public class simpleint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float principle = sc.nextFloat();
		float rate = sc.nextFloat();
		int time = sc.nextInt();
		float si = principle * time * rate;
		System.out.println("Simple Interest : "+si);
		sc.close();
	}

}
