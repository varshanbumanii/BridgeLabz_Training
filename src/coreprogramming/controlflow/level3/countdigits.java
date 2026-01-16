package core_programming.controlflow.level3;
import java.util.Scanner;
public class countdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int count = 0;
        if (n == 0) {
            count = 1;
        } else {
            while (n != 0) {
                n = n / 10; // remove last digit
                count++;
            }
        }
        System.out.println("Number of digits: " + count);
        sc.close();

	}

}
