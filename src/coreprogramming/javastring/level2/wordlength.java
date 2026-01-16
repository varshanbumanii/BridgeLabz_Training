package coreprogramming.javastring.level2;
import java.util.Scanner;
public class WordLength {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) text.charAt(count++);
        } catch (Exception e) {
            return count - 1;
        }
    }

    public static String[] splitWords(String text) {
        return text.split(" ");
    }

    public static String[][] wordWithLength(String[] words) {
        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }
        return data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] data = wordWithLength(splitWords(text));

        System.out.println("Word\tLength");
        for (String[] row : data)
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
    }
}
