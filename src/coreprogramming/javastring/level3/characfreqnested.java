package coreprogramming.javastring.level3;
import java.util.Scanner;
public class Characfreqnested {
    public static String[] findCharacterFrequency(String text) {

        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        // Nested loop to calculate frequency
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0')
                continue;

            freq[i] = 1;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate
                }
            }
        }

        // Count unique characters
        int count = 0;
        for (int i = 0; i < chars.length; i++)
            if (chars[i] != '0')
                count++;

        // Store character and frequency in 1D String array
        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " -> " + freq[i];
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] frequency = findCharacterFrequency(text);

        System.out.println("\nCharacter Frequency:");
        for (String s : frequency)
            System.out.println(s);
    }
}
