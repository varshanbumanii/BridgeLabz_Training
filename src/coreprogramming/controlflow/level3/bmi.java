package coreprogramming.controlflow.level3;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		float hcm = sc.nextFloat();
		float m = hcm/100;
		float bmi = w / (m*m);
		if(bmi<=18.4) {
			System.out.println("Under Weight");
		}
		else if(bmi>18.4 && bmi<24.9) {
			System.out.println("Normal");
		}
		else if(bmi>=25 && bmi<=49.9) {
			System.out.println("Over Weight");
		}
		else {
			System.out.println("Obese");
		}
		sc.close();

	}

}
