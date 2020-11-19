package com.company;

import java.util.Random;

public class Homework513 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        System.out.print("The initial array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        System.out.print("The array in decs order:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(sortingTheArrayInDesc(array)[i] + ", ");
        }
    }

    public static int[] sortingTheArrayInDesc(int[] array) {

        int number = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    number = array[i];
                    array[i] = array[j];
                    array[j] = number;
                }
            }
        }

        return array;

    }
}