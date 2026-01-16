package coreprogramming.stringhandling;

import java.util.Scanner;
public class SubStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String word = sc.nextLine();
        int count=0;
        String[] strArr = str.split(" ");
        for(int i=0; i<strArr.length;i++){
            if(strArr[i].equals(word)){
                count++;
            }
        }
        System.out.println(count);

    }

}
