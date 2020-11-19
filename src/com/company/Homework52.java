package com.company;

import java.util.Scanner;

public class Homework52 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int product = calculateTheProduct();
        System.out.println("The product is: " + product);
    }

    public static int calculateTheProduct() {

        System.out.println("Enter the first number.");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number.");
        int number2 = scanner.nextInt();
        return number1 * number2;
    }
}