package core_programming.builtInfunctions.problemstatements;
import java.util.Scanner;
public class calc {
    static double add(double a, double b) { return a + b; }
    static double sub(double a, double b) { return a - b; }
    static double mul(double a, double b) { return a * b; }
    static double div(double a, double b) { return a / b; }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println(add(a, b)); break;
            case '-': System.out.println(sub(a, b)); break;
            case '*': System.out.println(mul(a, b)); break;
            case '/': System.out.println(div(a, b)); break;
            default: System.out.println("Invalid Operator");
        }
        sc.close();
    }
}
