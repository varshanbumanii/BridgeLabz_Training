package core_programming.stringhandling;
import java.util.Scanner;
public class stringreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String reverse ="";
        for(int i=name.length()-1;i>=0;i--){
            reverse+=name.charAt(i);

        }
        System.out.println(reverse);


    }
}
