package com.company;

import java.util.Scanner;

public class Homework517 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number.");
        int number = scanner.nextInt();
        System.out.println("The factorial of " + number + " is " + calculatingFactorial(number) + ".");

    }

    public static int calculatingFactorial(int number) {

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}