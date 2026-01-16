package coreprogramming.javastring.level3;
import java.util.Scanner;
public class BMICalculator {
    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100;

            double bmi = weight / (heightM * heightM);

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = getStatus(bmi);
        }
        return result;
    }

    public static void display(String[][] data) {
        System.out.println("Height(cm)\tWeight\tBMI\tStatus");
        for (String[] row : data)
            System.out.println(row[0] + "\t\t" + row[1] + "\t" + row[2] + "\t" + row[3]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] input = new double[10][2];

        for (int i = 0; i < 10; i++) {
            input[i][0] = sc.nextDouble(); // weight
            input[i][1] = sc.nextDouble(); // height
        }

        display(calculateBMI(input));
    }
}
