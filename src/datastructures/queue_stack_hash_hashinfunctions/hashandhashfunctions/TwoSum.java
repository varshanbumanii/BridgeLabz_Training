package datastructures.queue_stack_hash_hashinfunctions.hashandhashfunctions;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                System.out.println("Indices Found: "
                        + map.get(complement) + " and " + i);
                System.out.println("Values: "
                        + complement + " + " + nums[i] + " = " + target);
                found = true;
                break;
            }

            map.put(nums[i], i);
        }

        if (!found) {
            System.out.println("No pair found with the given sum.");
        }

        sc.close();
    }
}

