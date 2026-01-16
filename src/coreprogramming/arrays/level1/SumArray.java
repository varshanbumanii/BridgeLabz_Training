package coreprogramming.arrays.level1;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>9 || n<6){
            System.out.println("Invalid Input");
            sc.close();
            return;
        }
        int[] arr =  new int[12];
        for(int i=0;i<12;i++){
            arr[i] = n*(i+1);
        }
        for(int j=0;j<12;j++){
            System.out.println(n+" x "+(j+1)+" = "+arr[j]);
        }
        sc.close();
    }
}
