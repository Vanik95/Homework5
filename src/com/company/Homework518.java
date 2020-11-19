package com.company;

import java.util.Random;
import java.util.Scanner;

public class Homework518 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number n:");
        int n = scanner.nextInt();
        System.out.println("The matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(makingTheMatrix(n)[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] makingTheMatrix(int n) {

        Random random = new Random();
        String plusMinusChars = "+-";
        char[][] matrix = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = plusMinusChars.charAt(random.nextInt(plusMinusChars.length()));
            }
        }
        return matrix;
    }
}