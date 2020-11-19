package com.company;

import java.util.Scanner;

public class Homework53 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double cubeOfProduct = calculateTheCubeOfProduct();
        System.out.println("The cube of product is: " + cubeOfProduct);

    }

    public static int calculateTheProduct() {

        System.out.println("Enter the first number.");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number.");
        int number2 = scanner.nextInt();
        return number1 * number2;
    }

    public static double calculateTheCubeOfProduct() {

        double product = calculateTheProduct();
        return Math.pow(product, 3);
    }
}