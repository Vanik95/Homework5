package com.company;

import java.util.Scanner;

public class Homework55 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        char middleCharacter = findingTheMiddleCharacter();
        System.out.println("The middle character of the text is: " + middleCharacter);

    }

    public static char findingTheMiddleCharacter() {

        System.out.println("Enter the text.");
        String text = scanner.nextLine();
        int length = text.length();
        return text.charAt((length - 1) / 2);

    }
}