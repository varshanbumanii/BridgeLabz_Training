package datastructures.sortingalgorithms;

import java.util.Scanner;

public class QuickSort {

    // Quick Sort method
    public static void quickSort(double[] arr, int low, int high) {

        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition method
    public static int partition(double[] arr, int low, int high) {

        double pivot = arr[high];   // choosing last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        double[] prices = new double[n];

        System.out.println("Enter product prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextDouble();
        }

        quickSort(prices, 0, n - 1);

        System.out.println("Sorted Product Prices :");
        for (double price : prices) {
            System.out.print(price + " ");
        }

        sc.close();
    }
}

