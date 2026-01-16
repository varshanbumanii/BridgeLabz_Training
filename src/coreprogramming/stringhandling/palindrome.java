package coreprogramming.stringhandling;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String reverse ="";
        for(int i=name.length()-1;i>=0;i--){
            reverse+=name.charAt(i);

        }
        if(reverse.equals(name)){
            System.out.println("is a palindrome");
        }
        else{
            System.out.println("is not a palindrome");
        }

    }
}
