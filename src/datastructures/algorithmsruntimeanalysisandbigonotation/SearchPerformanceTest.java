package datastructures.algorithmsruntimeanalysisandbigonotation;

import java.util.Arrays;
import java.util.Random;

public class SearchPerformanceTest {
    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 1_000_000};
        int target = -1;

        for (int n : sizes) {

            int[] arr = generateArray(n);
            target = arr[n - 1];

            long linearStart = System.nanoTime();
            linearSearch(arr, target);
            long linearEnd = System.nanoTime();

            Arrays.sort(arr);

            long binaryStart = System.nanoTime();
            binarySearch(arr, target);
            long binaryEnd = System.nanoTime();

            System.out.println("Dataset Size: " + n);
            System.out.println("Linear Search Time (ns): " + (linearEnd - linearStart));
            System.out.println("Binary Search Time (ns): " + (binaryEnd - binaryStart));
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

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
