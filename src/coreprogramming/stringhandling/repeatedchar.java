package core_programming.stringhandling;

import java.util.Scanner;

public class repeatedchar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int[] freq = new int[216];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        char mostFrequent = str.charAt(0);
        int maxCount = freq[mostFrequent];

        for (int i = 1; i < str.length(); i++) {
            if (freq[str.charAt(i)] > maxCount) {
                maxCount = freq[str.charAt(i)];
                mostFrequent = str.charAt(i);
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");

        scan.close();
    }
}
