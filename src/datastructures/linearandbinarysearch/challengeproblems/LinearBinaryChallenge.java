//package datastructures.linearandbinarysearch.challengeproblems;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class LinearBinaryChallenge {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter array size: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int missing = firstMissingPositive(arr.clone());
//        System.out.println(missing);
//
//        System.out.print("Enter target: ");
//        int target = sc.nextInt();
//
//        Arrays.sort(arr);
//        int index = binarySearch(arr, target);
//
//        System.out.println(index);
//        sc.close();
//    }
//
//    static int firstMissingPositive(int[] nums) {
//        int n = nums.length;
//
//        for (int i = 0; i < n; i++) {
//            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
//                int temp = nums[i];
//                nums[i] = nums[temp - 1];
//                nums[temp - 1] = temp;
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            if (nums[i] != i + 1) {
//                return i + 1;
//            }
//        }
//
//        return n + 1;
//    }
//
//    static int binarySearch(int[] arr, int target) {
//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left <= right) {
//            int mid = (left + right) / 2;
//
//            if (arr[mid] == target) {
//                return mid;
//            } else if (arr[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//
//        return -1;
//    }
//}
