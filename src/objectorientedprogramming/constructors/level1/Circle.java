package objectorientedprogramming.constructors.level1;

import java.util.Scanner;

class Circle {

    double radius;
    Circle() {
        this(1.0);
    }
    Circle(double r) {
        radius = r;
    }
    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + Math.PI*radius*radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Scanner sc = new Scanner(System.in);
        Circle c2 = new Circle(sc.nextInt());

        c1.display();
        c2.display();
    }
}

