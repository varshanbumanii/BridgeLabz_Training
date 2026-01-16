package core_programming.programmingelements.level1;
import java.util.Scanner;
public class cmtofeet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double h = sc.nextDouble();
		double inch = h/2.54;
		int f = (int)inch/12;
		double remain = inch % 2.54;
		System.out.println("Height is "+h+"cms converted to "+f+" feet and "+remain+" inches");
		sc.close();
	}

}
