package core_programming.methods.level3;

public class zarabonus {
    public static double[][] generateEmployeeData() {
        double[][] data = new double[10][2]; // salary, years

        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + (int)(Math.random() * 90000); // salary
            data[i][1] = 1 + (int)(Math.random() * 10);       // years
        }
        return data;
    }

    // Calculate bonus & new salary
    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[10][2]; // bonus, new salary

        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            double years = data[i][1];

            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            result[i][0] = bonus;
            result[i][1] = salary + bonus;
        }
        return result;
    }

    // Display totals
    public static void displayTotals(double[][] oldData, double[][] newData) {
        double totalOld = 0, totalBonus = 0, totalNew = 0;

        System.out.println("Salary\tYears\tBonus\tNew Salary");

        for (int i = 0; i < 10; i++) {
            totalOld += oldData[i][0];
            totalBonus += newData[i][0];
            totalNew += newData[i][1];

            System.out.println(oldData[i][0] + "\t" +
                    oldData[i][1] + "\t" +
                    newData[i][0] + "\t" +
                    newData[i][1]);
        }

        System.out.println("\nTotal Old Salary: " + totalOld);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNew);
    }

    public static void main(String[] args) {

        double[][] employeeData = generateEmployeeData();
        double[][] bonusData = calculateBonus(employeeData);

        displayTotals(employeeData, bonusData);
    }
}
