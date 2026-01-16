package core_programming.methods.level2;
import java.util.Scanner;
public class quadraticroot {
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0)
            return new double[0];

        if (delta == 0)
            return new double[]{ -b / (2 * a) };

        return new double[]{
                (-b + Math.sqrt(delta)) / (2 * a),
                (-b - Math.sqrt(delta)) / (2 * a)
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);

        for (double r : roots)
            System.out.println(r);
    }
}
