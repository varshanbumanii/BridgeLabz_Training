package coreprogramming.arrays.level2;

import java.util.Scanner;

public class AgeandHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[3];
        int[] age = new int[3];
        for (int i = 0; i < 3; i++) {
            heights[i] = sc.nextInt();
            age[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            if(heights[i]>heights[i+1]){
                if(heights[i]>heights[i+2]){
                    System.out.println("Amar is taller!");
                }
                else{
                    System.out.println("Anthony is taller!");
                }
            }
            else if(heights[i+2]>heights[i+1]){}
        }
    }
}
