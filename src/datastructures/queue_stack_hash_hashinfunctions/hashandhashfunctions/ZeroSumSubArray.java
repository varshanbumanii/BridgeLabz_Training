package datastructures.queue_stack_hash_hashinfunctions.hashandhashfunctions;

import java.util.*;

public class ZeroSumSubArray {

    static void findZeroSumSubarrays(int[] arr) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        // Initialize sum 0 at index -1
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        System.out.println("Zero Sum Subarrays :");

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int startIndex : map.get(sum)) {
                    System.out.println("Subarray found from index "
                            + (startIndex + 1) + " to " + i);
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }

    public static void main(String[] args) {

        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};

        findZeroSumSubarrays(arr);
    }
}

