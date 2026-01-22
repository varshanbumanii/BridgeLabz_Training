package datastructures.algorithmsruntimeanalysisandbigonotation;

import java.util.Arrays;
import java.util.Random;

public class SortingPerformanceTest {
    public static void main(String[] args) {

        int[] sizes = {1000, 10000};

        for (int n : sizes) {

            int[] original = generateArray(n);

            int[] bubbleArr = original.clone();
            int[] mergeArr = original.clone();
            int[] quickArr = original.clone();

            long bubbleStart = System.nanoTime();
            bubbleSort(bubbleArr);
            long bubbleEnd = System.nanoTime();

            long mergeStart = System.nanoTime();
            mergeSort(mergeArr, 0, mergeArr.length - 1);
            long mergeEnd = System.nanoTime();

            long quickStart = System.nanoTime();
            quickSort(quickArr, 0, quickArr.length - 1);
            long quickEnd = System.nanoTime();

            System.out.println("Dataset Size: " + n);
            System.out.println("Bubble Sort Time (ns): " + (bubbleEnd - bubbleStart));
            System.out.println("Merge Sort Time (ns): " + (mergeEnd - mergeStart));
            System.out.println("Quick Sort Time (ns): " + (quickEnd - quickStart));
            System.out.println();
        }
    }

    static int[] generateArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n * 10);
        }
        return arr;
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
