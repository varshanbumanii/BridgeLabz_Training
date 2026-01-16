package coreprogramming.javastring.level3;
import java.util.Scanner;
public class Palindrome {
    public static boolean isPalindromeLoop(String text) {
        int s = 0, e = text.length() - 1;
        while (s < e)
            if (text.charAt(s++) != text.charAt(e--))
                return false;
        return true;
    }

    public static boolean isPalindromeRec(String text, int s, int e) {
        if (s >= e) return true;
        if (text.charAt(s) != text.charAt(e)) return false;
        return isPalindromeRec(text, s + 1, e - 1);
    }

    public static boolean isPalindromeArray(String text) {
        char[] a = text.toCharArray();
        for (int i = 0; i < a.length / 2; i++)
            if (a[i] != a[a.length - 1 - i])
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        System.out.println(isPalindromeLoop(text));
        System.out.println(isPalindromeRec(text, 0, text.length() - 1));
        System.out.println(isPalindromeArray(text));
    }
}
