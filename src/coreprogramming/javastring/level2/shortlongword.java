package core_programming.javastring.level2;
import java.util.Scanner;
public class shortlongword {
    public static int findLength(String text) {
        int c = 0;
        try {
            while (true) text.charAt(c++);
        } catch (Exception e) {
            return c - 1;
        }
    }

    public static int[] findShortLong(String[][] data) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (String[] row : data) {
            int len = Integer.parseInt(row[1]);
            min = Math.min(min, len);
            max = Math.max(max, len);
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = text.split(" ");
        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }

        int[] result = findShortLong(data);
        System.out.println("Shortest Length: " + result[0]);
        System.out.println("Longest Length: " + result[1]);
    }
}
