package coreprogramming.methods.level2;
import java.util.Scanner;
public class Friends {
    public static int findYoungest(int[] ages) {
        int min = ages[0];
        for (int a : ages)
            if (a < min) min = a;
        return min;
    }

    public static double findTallest(double[] heights) {
        double max = heights[0];
        for (double h : heights)
            if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[3];
        double[] heights = new double[3];
        System.out.println("Enter Amar, Akbar, and Anthony's Age and Height : ");

        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextInt();
            heights[i] = sc.nextDouble();
        }

        System.out.println("Youngest Age: " + findYoungest(ages));
        System.out.println("Tallest Height: " + findTallest(heights));
    }
}
