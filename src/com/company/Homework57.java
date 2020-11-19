package com.company;

import java.util.Scanner;

public class Homework57 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean leapCondition = checkingLeapYearStatement();
        System.out.println(leapCondition);

    }

    public static boolean checkingLeapYearStatement() {

        System.out.println("Enter the year.");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }

    }
}