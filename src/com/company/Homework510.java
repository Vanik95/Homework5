package com.company;

import java.util.Scanner;

public class Homework510 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the sides of triangle:");
        System.out.println("Enter a:");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        System.out.println("Enter c:");
        double c = scanner.nextDouble();
        double area = calculatingTheArea(a, b, c);
        double perimeter = calculatingThePerimeter(a, b, c);

        if (checkingValidationOfTriangle(a, b, c)) {
            System.out.println("The perimeter is: " + perimeter);
            System.out.println("The area is: " + area);
        } else {
            System.out.println("The triangle is not valid.");
        }

    }

    public static boolean checkingValidationOfTriangle(double a, double b, double c) {

        if (((a + b) >= c) && ((a + c) >= b) && ((c + b) >= a)) {
            return true;
        } else {
            return false;
        }

    }

    public static double calculatingThePerimeter(double a, double b, double c) {

        return a + b + c;

    }

    public static double calculatingTheArea(double a, double b, double c) {

        double perimeter = a + b + c;
        return Math.pow(((perimeter) * (perimeter - a) * (perimeter - b) * (perimeter - c)), 0.5);

    }
}