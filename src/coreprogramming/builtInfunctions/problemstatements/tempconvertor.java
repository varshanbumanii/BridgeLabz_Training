package coreprogramming.builtInfunctions.problemstatements;
import java.util.Scanner;
public class TempConvertor {
    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temp = sc.nextDouble();
        char choice = sc.next().charAt(0);

        if (choice == 'C')
            System.out.println(celsiusToFahrenheit(temp));
        else if (choice == 'F')
            System.out.println(fahrenheitToCelsius(temp));

        sc.close();
    }
}
