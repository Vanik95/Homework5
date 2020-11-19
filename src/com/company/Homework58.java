package com.company;

import java.util.Scanner;

public class Homework58 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the password:");
        String password = scanner.nextLine();
        if (checkingValidation(password)) {
            System.out.println("Password is valid: " + password);
        } else {
            System.out.println("Password is not valid: ");
        }

    }

    public static boolean settingPasswordLength(String text) {

        return text.length() >= 10;

    }

    public static boolean settingLettersAndDigits(String text) {

        String values = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        for (int i = 0; i < text.length(); i++) {
            boolean answer = false;
            for (int j = 0; j < values.length(); j++) {
                if (values.charAt(j) == text.charAt(i)) {
                    answer = true;
                    break;
                }
            }
            if (!answer) {
                return false;
            }
        }
        return true;

    }

    public static boolean settingSecondDigitCondition(String text) {

        String digit = "0123456789";
        int quantity = 0;

        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < digit.length(); j++) {
                if (text.charAt(i) == digit.charAt(j)) {
                    quantity++;
                    break;
                }
            }
        }
        return quantity >= 2;

    }

    public static boolean checkingValidation(String text) {

        if (settingPasswordLength(text) && settingLettersAndDigits(text) && settingSecondDigitCondition(text)) {
            return true;
        }
        return false;
    }
}