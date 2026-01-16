package coreprogramming.javastring.level2;
import java.util.Scanner;
public class Compare {
    public static int[] trimIndex(String text) {
        int start = 0, end = text.length() - 1;

        while (text.charAt(start) == ' ')
            start++;

        while (text.charAt(end) == ' ')
            end--;

        return new int[]{start, end + 1};
    }

    public static String substring(String text, int s, int e) {
        String res = "";
        for (int i = s; i < e; i++)
            res += text.charAt(i);
        return res;
    }

    public static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] idx = trimIndex(text);
        String userTrim = substring(text, idx[0], idx[1]);
        String builtInTrim = text.trim();

        System.out.println("Same? " + compare(userTrim, builtInTrim));
    }
}
