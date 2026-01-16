package core_programming.controlflow.level2;

import java.util.Scanner;

public class buzzfizzwhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i =1;
		int n = sc.nextInt();
		if(n%3==0) {
			while(i<n+1) {
				System.out.println("Fizz");
				i++;
				}
			}
		else if(n%5==0) {
			while(i<n+1) {
				System.out.println("Buzz");
				i++;
				}
			}
		else {
			System.out.println("Not a multiple of 3 or 5");
			}
	sc.close();

}}
