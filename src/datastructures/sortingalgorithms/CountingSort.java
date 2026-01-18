package datastructures.sortingalgorithms;

import java.util.Scanner;

public class CountingSort{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int MIN_AGE = 10;
        final int MAX_AGE = 18;
        int range = MAX_AGE - MIN_AGE + 1;

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = new int[n];

        System.out.println("Enter student ages (10 to 18):");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        int[] count = new int[range];

        // Count frequency
        for (int age : ages) {
            count[age - MIN_AGE]++;
        }

        // Build sorted output
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                ages[index++] = i + MIN_AGE;
                count[i]--;
            }
        }

        System.out.println("Sorted Student Ages :");
        for (int age : ages) {
            System.out.print(age + " ");
        }

        sc.close();
    }
}

