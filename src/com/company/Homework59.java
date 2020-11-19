package com.company;

import java.util.Scanner;

public class Homework59 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the radius:");
        double radius = scanner.nextDouble();
        double area = calculatingTheArea(radius);
        double perimeter = calculatingThePerimeter(radius);
        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);

    }

    public static double calculatingTheArea(double radius) {

        return Math.pow(radius, 2) * Math.PI;

    }

    public static double calculatingThePerimeter(double radius) {

        return 2 * Math.PI * radius;

    }

}