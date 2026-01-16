package core_programming.javastring.level3;
import java.util.Scanner;
public class uniquecharac {
    public static int length(String text) {
        int i = 0;
        try {
            while (true) text.charAt(i++);
        } catch (Exception e) {
            return i - 1;
        }
    }

    public static char[] uniqueChars(String text) {
        char[] temp = new char[length(text)];
        int count = 0;

        for (int i = 0; i < length(text); i++) {
            char ch = text.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++)
                if (text.charAt(j) == ch)
                    unique = false;

            if (unique)
                temp[count++] = ch;
        }

        char[] result = new char[count];
        for (int i = 0; i < count; i++)
            result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        char[] result = uniqueChars(text);
        for (char c : result)
            System.out.print(c + " ");
    }
}
