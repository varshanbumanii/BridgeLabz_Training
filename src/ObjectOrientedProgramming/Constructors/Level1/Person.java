package objectorientedprogramming.Constructors.Level1;

import java.util.Scanner;

class Person {

    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    Person(Person p) {
        name = p.name;
        age = p.age;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p1 = new Person(sc.next(), sc.nextInt());
        Person p2 = new Person(p1);

        p1.display();
        p2.display();
    }
}

