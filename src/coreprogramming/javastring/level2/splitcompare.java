package core_programming.javastring.level2;
import java.util.Scanner;
public class splitcompare {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count++);
            }
        } catch (RuntimeException e) {
            return count - 1;
        }
    }

    public static String[] splitWords(String text) {
        int words = 1;
        for (int i = 0; i < findLength(text); i++)
            if (text.charAt(i) == ' ')
                words++;

        int[] spaceIndex = new int[words + 1];
        int idx = 1;
        spaceIndex[0] = -1;

        for (int i = 0; i < findLength(text); i++)
            if (text.charAt(i) == ' ')
                spaceIndex[idx++] = i;

        spaceIndex[idx] = findLength(text);

        String[] result = new String[words];
        for (int i = 0; i < words; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++)
                word += text.charAt(j);
            result[i] = word;
        }
        return result;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] userSplit = splitWords(text);
        String[] builtInSplit = text.split(" ");

        System.out.println("Same? " +
                compareArrays(userSplit, builtInSplit));
    }
}
