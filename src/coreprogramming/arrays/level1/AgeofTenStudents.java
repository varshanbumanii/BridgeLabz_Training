package coreprogramming.arrays.level1;

import java.util.Scanner;

public class AgeofTenStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] =  sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.println("Enter valid age");
            } else if (arr[i]>=18) {
                System.out.println("Age "+arr[i]+" is eligible to vote");
            }
            else {
                System.out.println("Age "+arr[i]+" is not eligible to vote");
            }
        }
        sc.close();
    }
}
