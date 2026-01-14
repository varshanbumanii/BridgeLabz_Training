package ObjectOrientedProgramming.ClassandObjects.Level1;

import java.util.Scanner;

public class MobilePhone {
    String brand;
    String model;
    Double price;
    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
    }
    public static void main(String[] args){
        MobilePhone obj = new MobilePhone();
        Scanner sc = new Scanner(System.in);
        obj.brand=sc.nextLine();
        obj.model=sc.nextLine();
        obj.price=sc.nextDouble();
        obj.display();
    }
}
