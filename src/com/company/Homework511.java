package com.company;

import java.util.Random;

public class Homework511 {

    public static void main(String[] args) {

        int[] array = new int[10];
        System.out.println("The array link is: " + printingTheArray(array));
    }

    public static int[] initializingTheArray(int[] array) {

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;

    }

    public static int[] printingTheArray(int[] array) {

        System.out.print("The array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(initializingTheArray(array)[i] + ", ");
        }
        System.out.println();
        return array;

    }
}