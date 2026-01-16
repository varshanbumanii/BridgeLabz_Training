package coreprogramming.stringhandling;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ster = sc.nextLine();
        String uni = "";
        for(int i=0; i < ster.length(); i++){
            if(uni.indexOf(ster.charAt(i)) == -1){
                uni += ster.charAt(i);
            }
        }
        System.out.println(uni);
    }
}
