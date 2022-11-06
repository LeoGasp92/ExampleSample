package oop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CallingTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side1 : ");
        double a = scanner.nextDouble();
        System.out.println("Enter side2 : ");
        double b = scanner.nextDouble();
        System.out.println("Enter side3 : ");
        double c = scanner.nextDouble();

// Create Instance
    Triangle triangle1 = new Triangle();
    triangle1.setA(a);
    triangle1.setB(b);
    triangle1.setC(c);
    triangle1.areaOfTriangle();


    }
}

