package core_programming.stringhandling;

import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0);
        String str1 = sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=c){
                str1 += str.charAt(i);
            }
        }

        System.out.println(str1);
    }
}
