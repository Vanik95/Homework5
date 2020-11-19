package com.company;

import java.util.Scanner;

public class Homework56 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int wordsQuantity = countingTheWordsQuantity();
        System.out.println("The sentence has " + wordsQuantity + " word(s).");

    }

    public static int countingTheWordsQuantity() {

        System.out.println("Enter the sentence.");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            count = i + 1;
        }

        return count;

    }
}