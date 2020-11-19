package com.company;

import java.util.Scanner;

public class Homework516 {

    public static void main(String[] args) {

        System.out.println("Enter the word:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println("Palindrome condition is " + checkingPalindromeCondition(word) + ".");

    }

    public static boolean checkingPalindromeCondition(String word) {

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(word.length() - 1 - i)) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}