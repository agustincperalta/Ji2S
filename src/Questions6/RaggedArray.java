package Questions6;

import java.util.Random;
import java.util.Scanner;

/*
 * (a) Write instructions to create a ragged 2D array of integers, called
 * triangle, that has the following form:
 * 0[]
 * 1[] []
 * 2[] [] []
 * 3[] [] [] []
 *  0  1  2  3
 * (b) Write a fragment of code to find the largest number in
 * the triangle array
 * */
public class RaggedArray {

    public static void main(String[] args) {
        int[][] triangle = new int[4][];

        triangle[0] = new int[1];
        triangle[1] = new int[2];
        triangle[2] = new int[3];
        triangle[3] = new int[4];

        fillArray(triangle);
        printArray(triangle);
        System.out.println();
        System.out.println("El número más grande del array irregular es: " +
                findLargest(triangle));

    }

    private static int findLargest(int[][] arrayIn) {
        int largest = arrayIn[0][0];
        for (int i = 0; i < arrayIn.length; i++) {
            for (int j = 0; j < arrayIn[i].length; j++) {
                if (largest < arrayIn[i][j]) {
                    largest = arrayIn[i][j];
                }
            }
        }
        return largest;
    }

    private static void fillRndArray(int[][] arrayIn) {
        Random rnd = new Random();
        for (int i = 0; i < arrayIn.length; i++) {
            for (int j = 0; j < arrayIn[i].length; j++) {
                arrayIn[i][j] = (int) (rnd.nextDouble() * 100);
            }
        }
    }

    private static void fillArray(int[][] arrayIn) {
        Scanner kbd = new Scanner(System.in);
        for (int i = 0; i < arrayIn.length; i++) {
            for (int j = 0; j < arrayIn[i].length; j++) {
                System.out.println("value " + "[" + i + "][" + j + "]:");
                arrayIn[i][j] = kbd.nextInt();
            }
        }
    }

    private static void printArray(int[][] arrayIn) {
        for (int i = 0; i < arrayIn.length; i++) {
            for (int j = 0; j < arrayIn[i].length; j++) {
                System.out.print(arrayIn[i][j] + " ");
            }
            System.out.println();
        }
    }
}
