package coreprogramming.arrays.level1;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[12];
        for(int i=0;i<10;i++){
            arr[i] = n*(i+1);
        }
        for(int j=0;j<10;j++){
            System.out.println(n+" x "+(j+1)+" = "+arr[j]);
        }
        sc.close();
    }
}
