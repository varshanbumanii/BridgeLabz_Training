package coreprogramming.arrays.level1;
import java.util.Scanner;
public class PositiveorNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i =0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.println(arr[i]+" is a Negative number");
            }
            else if(arr[i]==0){
                System.out.println(arr[i]+" is a Zero");
            }
            else {
                System.out.println(arr[i]+" is a Positive number");
            }
        }
        sc.close();
    }
}
