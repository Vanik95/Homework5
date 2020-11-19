package com.company;

import java.util.Scanner;

public class Homework54 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int smallestNumber = findingSmallestNumber();
        System.out.println("The smallest number is: " + smallestNumber);

    }

    public static int findingSmallestNumber() {

        System.out.println("Enter the first number.");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number.");
        int number2 = scanner.nextInt();
        System.out.println("Enter the third number.");
        int number3 = scanner.nextInt();
        int smallestNumber = 0;

        if (number1 < number2 && number1 < number3 && number1 != number2 && number1 != number3) {
            smallestNumber = number1;
        } else if (number2 < number1 && number2 < number3 && number2 != number1 && number2 != number3) {
            smallestNumber = number2;
        } else if (number3 < number1 && number3 < number2 && number3 != number1 && number3 != number2) {
            smallestNumber = number3;
        }
        return smallestNumber;
    }
}