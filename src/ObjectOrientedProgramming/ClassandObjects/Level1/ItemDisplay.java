package ObjectOrientedProgramming.ClassandObjects.Level1;

import java.util.Scanner;

public class ItemDisplay {
    String ItemName;
    String Itemcode;
    double price;
    void display()
    {
        System.out.println("Item Name: " + ItemName);
        System.out.println("Item Code: " + Itemcode);
        System.out.println("Price: " + price);
    }
    double totalprice(int quantity){
        return quantity*price;
    }
    public static void main(String[] args) {
        ItemDisplay obj = new ItemDisplay();
        Scanner sc = new Scanner(System.in);
        obj.ItemName = sc.nextLine();
        obj.Itemcode = sc.nextLine();
        obj.price = sc.nextDouble();
        int n = sc.nextInt();
        obj.display();
        System.out.println("Total Cost: "+obj.totalprice(n));
    }
}
