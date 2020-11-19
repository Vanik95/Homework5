package com.company;

import java.util.Random;

public class Homework51 {

    static Random random = new Random();

    public static void main(String[] args) {

        int sum = calculateTheSum();
        System.out.println("The sum is: " + sum);
    }

    public static int calculateTheSum() {
        int number1 = random.nextInt();
        int number2 = random.nextInt();
        return number1 + number2;
    }
}