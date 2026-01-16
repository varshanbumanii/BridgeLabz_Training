package core_programming.arrays.level2;

import java.util.Scanner;

public class EmpBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] sal = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newsal = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        for (int i = 0; i < 10; i++) {
            sal[i] = sc.nextDouble();
            years[i] = sc.nextDouble();
            totalOldSalary += sal[i];
        }
        for (int i = 0; i < 10; i++) {
            if(years[i]<5){
                bonus[i] = sal[i]*0.02;
                totalBonus += bonus[i];
            }
            else{
                bonus[i] = sal[i]*0.05;
                totalBonus += bonus[i];
            }
            newsal[i] = sal[i] + bonus[i];
            totalNewSalary += newsal[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(sal[i] + " - Old Sal " + years[i] + " - Years " + bonus[i] + " - Bonus " + newsal[i]+" - New Salary " + totalNewSalary);
        }
        sc.close();
    }
}
