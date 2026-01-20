package datastructures.linearandbinarysearch.stringbuilder;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();

        String reversedString = sb.toString();

        System.out.println("Reversed String: " + reversedString);

        sc.close();
    }
}

