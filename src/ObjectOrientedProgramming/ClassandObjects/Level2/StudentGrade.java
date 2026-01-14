package ObjectOrientedProgramming.ClassandObjects.Level2;

import java.util.Scanner;

public class StudentGrade {
    String name;
    String rollnumber;
    double m1;
    double m2;
    double m3;
    double avg(){
        return (m1+m2+m3)/3;
    }
    char grades() {
        if (avg() >= 90)
            return 'A';
        else if (avg() >= 80)
            return 'B';
        else if (avg() >= 70)
            return 'C';
        else if (avg() >= 60)
            return 'D';
        else
            return 'E';
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Rollnumber: " + rollnumber);
        System.out.println("M1: " + m1);
        System.out.println("M2: " + m2);
        System.out.println("M3: " + m3);
        System.out.println("Avg: " + avg());
        System.out.println("Grades: " + grades());
    }
    public static void main(String[] args) {
        StudentGrade obj = new StudentGrade();
        Scanner sc = new Scanner(System.in);
        obj.name = sc.nextLine();
        obj.rollnumber = sc.nextLine();
        obj.m1 = sc.nextDouble();
        obj.m2 = sc.nextDouble();
        obj.m3 = sc.nextDouble();
        obj.avg();
        obj.display();
        sc.close();
    }
    }



