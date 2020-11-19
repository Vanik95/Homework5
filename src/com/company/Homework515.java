package com.company;

import java.util.Random;

public class Homework515 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        System.out.print("The initial array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        System.out.print("The reversed array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(reversingTheArray(array)[i] + ", ");
        }
    }

    public static int[] reversingTheArray(int[] array) {

        int[] reversedArray = new int[10];
        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = array[reversedArray.length - 1 - i];
        }
        return reversedArray;
    }
}