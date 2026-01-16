package coreprogramming.arrays.level1;

import java.util.Scanner;

public class AvgHeight {
    public  static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double[] arr = new double[11];
        for(int i=0;i<11;i++){
            arr[i]=sc.nextDouble();
        }
        double sum =0;
        for(int i=0;i<11;i++)
        {
            sum+=arr[i];
        }
        double avg=sum/11;
        System.out.print("Avg Height = "+avg);
        sc.close();
    }
}
