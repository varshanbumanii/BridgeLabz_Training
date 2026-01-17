package datastructures.queue_stack_hash_hashinfunctions.hashandhashfunctions;

import java.util.HashMap;
import java.util.Scanner;

public class PairWithGivenSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        boolean found = false;

        for (int i = 0; i < n; i++) {

            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                System.out.println("Pair Found: " + complement + " + " + arr[i] + " = " + target);
                found = true;
                break;
            }

            map.put(arr[i], i);
        }

        if (!found) {
            System.out.println("No pair found with the given sum.");
        }

        sc.close();
    }
}

