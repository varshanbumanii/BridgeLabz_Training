package core_programming.stringhandling;

import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            }
            else{
                result += Character.toLowerCase(ch);
        }
    }
        System.out.println(result);
    sc.close();
    }
}
