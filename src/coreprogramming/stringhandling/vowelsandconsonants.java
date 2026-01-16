package core_programming.stringhandling;
import java.util.Scanner;
public class VowelsandConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='u' || ch=='o' || ch =='A' || ch=='E' || ch=='I' || ch=='U' || ch=='O') {
                vowels++;
            }
            else {
                consonants++;
            }
        }
        System.out.println("Vowels Count: "+vowels);
        System.out.println("Consonants Count: "+consonants);

    }
}
