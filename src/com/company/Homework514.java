package com.company;

public class Homework514 {

    public static void main(String[] args) {

        System.out.print("Prime numbers from 1 to 100 are: ");
        System.out.print(findingPrimeNumbers());

    }

    public static String findingPrimeNumbers() {

        String primeNumbers = "";

        for (int i = 1; i <= 100; i++) {
            int counter = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + ", ";
            }
        }
        return primeNumbers;
    }
}