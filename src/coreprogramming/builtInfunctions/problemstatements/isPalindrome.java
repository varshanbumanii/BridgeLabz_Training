package core_programming.builtInfunctions.problemstatements;
import java.util.Scanner;
public class isPalindrome {
    static boolean isPalindrome(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(isPalindrome(str) ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}
