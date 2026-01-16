package core_programming.stringhandling;

import java.util.Scanner;

public class lexcompare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1 =sc.nextLine();
        String str2 =sc.nextLine();
        int minLength = Math.min(str1.length(), str2.length());
        int result = 0;
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                result = str1.charAt(i) - str2.charAt(i);
                break;
            }
        }
        if (result == 0) {
            result = str1.length() - str2.length();
        }

        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        } else if (result > 0) {
            System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order");
        } else {
            System.out.println("Both strings are equal");
        }

        sc.close();
    }
}
