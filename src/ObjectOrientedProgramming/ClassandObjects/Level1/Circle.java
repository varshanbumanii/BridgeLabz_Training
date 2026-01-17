package objectorientedprogramming.classandobjects.level1;
import java.util.Scanner;
public class Circle {
    double radius;
    double area;
    double perimeter;
    void area(){
        area = (Math.PI * Math.pow(radius, 2));
        perimeter = 2*Math.PI;
        System.out.println("The area of the circle is: " + area);
        System.out.println("The perimeter of the circle is: " + perimeter);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle obj = new Circle();
        obj.radius = sc.nextDouble();
        obj.area();
    }
}
