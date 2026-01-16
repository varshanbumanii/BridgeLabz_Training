package coreprogramming.stringhandling;

import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            sc.close();
            return;
        }

        int[] freq = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.println("Not Anagrams");
                sc.close();
                return;
            }
        }

        System.out.println("Anagrams");
        sc.close();
    }
}
