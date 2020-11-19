package com.company;

import java.util.Random;
import java.util.Scanner;

public class Homework519 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the number n:");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(51) + 27;
            }
        }
        System.out.println("The initial matrix is:");
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        rotating90degree(matrix);
        rotating180degree(matrix);
        rotating270degree(matrix);

    }

    public static void rotating90degree(int[][] matrix) {

        System.out.println();
        System.out.println("The final matrix is (rotated in 90 degree):");
        System.out.println();
        for (int j = 0; j < matrix.length; j++) {
            for (int i = matrix.length - 1; i >= 0; i--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotating180degree(int[][] matrix) {

        System.out.println();
        System.out.println("The final matrix is (rotated in 180 degree):");
        System.out.println();
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotating270degree(int[][] matrix) {

        System.out.println();
        System.out.println("The final matrix is (rotated in 270 degree):");
        System.out.println();
        for (int j = matrix.length - 1; j >= 0; j--) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}