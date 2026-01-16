package core_programming.stringhandling;

import java.util.Scanner;

public class replacemethod {
    public static void replacestrr(String sent, String str1,String str2){
        for(int i =0; i<sent.length();i++){
            if(sent.contains(str1)){
                sent=sent.replace(str1,str2);
            }
        }
        System.out.println(sent);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sent = sc.nextLine();
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        replacestrr(sent,str1,str2);
        sc.close();
    }
}
