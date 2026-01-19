package objectorientedprogramming.classandobjects.level2;

import java.util.Scanner;

public class Palindrome {
    String text;
    boolean checkPalindrome(){
        int i = 0;
        int j = text.length() - 1;

        while (i < j) {
            if (text.charAt(i) != text.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    void displayResult() {
        if (checkPalindrome()) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        Palindrome pc = new Palindrome();
        pc.text = sc.nextLine();

        pc.displayResult();
    }
    }

