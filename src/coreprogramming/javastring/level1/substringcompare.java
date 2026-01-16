package coreprogramming.javastring.level1;
import java.util.Scanner;
public class SubStringCompare {
    public static String substringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++)
            if (s1.charAt(i) != s2.charAt(i))
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String s1 = substringUsingCharAt(text, start, end);
        String s2 = text.substring(start, end);

        System.out.println("User substring: " + s1);
        System.out.println("Built-in substring: " + s2);
        System.out.println("Same? " + compareStrings(s1, s2));
    }
}
