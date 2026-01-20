package datastructures.linearandbinarysearch.stringbuffer;

import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        StringBuffer buffer = new StringBuffer();

        for (String s : arr) {
            buffer.append(s);
        }

        System.out.println("Concatenated String: " + buffer.toString());
        sc.close();
    }
}

