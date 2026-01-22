package datastructures.algorithmsruntimeanalysisandbigonotation;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Random;

public class SearchComparison {
    public static void main(String[] args) {

        int[] sizes = {1000, 100000, 1_000_000};

        for (int n : sizes) {

            int[] arr = new int[n];
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();

            for (int i = 0; i < n; i++) {
                arr[i] = i;
                hashSet.add(i);
                treeSet.add(i);
            }

            int target = n - 1;

            long arrayStart = System.nanoTime();
            linearSearch(arr, target);
            long arrayEnd = System.nanoTime();

            long hashStart = System.nanoTime();
            hashSet.contains(target);
            long hashEnd = System.nanoTime();

            long treeStart = System.nanoTime();
            treeSet.contains(target);
            long treeEnd = System.nanoTime();

            System.out.println("Dataset Size: " + n);
            System.out.println("Array Search Time (ns): " + (arrayEnd - arrayStart));
            System.out.println("HashSet Search Time (ns): " + (hashEnd - hashStart));
            System.out.println("TreeSet Search Time (ns): " + (treeEnd - treeStart));
            System.out.println();
        }
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

