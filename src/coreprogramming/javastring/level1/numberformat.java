package coreprogramming.javastring.level1;
import java.util.Scanner;
public class NumberFormat {
    public static void generateException(String text) {
        int n = Integer.parseInt(text);
        System.out.println(n);
    }

    public static void handleException(String text) {
        try {
            int n = Integer.parseInt(text);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        // generateException(text);
        handleException(text);
    }
}
