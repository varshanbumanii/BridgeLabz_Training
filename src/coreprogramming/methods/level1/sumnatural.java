package core_programming.methods.level1;
import java.util.Scanner;
public class sumnatural {
    public static int sumOfNatural(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Sum = " + sumOfNatural(n));
    }
}
