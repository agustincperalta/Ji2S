package Exercises6;

import java.util.Scanner;

/*
* (a) rewrite the contains method using varargs syntax as discussed
* in self question 5
* (b) add an additional method to return the average from the array
* of integers (make use of the sum method to help you calculate
* the average)
* (c) add one more method to display on the screen all those values
* greater than or equal to the average
* */
public class SomeUsefulArrayMethods {

    public static void main(String[] args) {
        char choice;
        Scanner kbd = new Scanner(System.in);
        int[] someArray; // declare an integer array
        System.out.println("How  many elements to store");
        int size = kbd.nextInt();
        //size the array
        someArray = new int[size];
        // menu

        do {
            System.out.println();
            System.out.println("[1] Enter values");
            System.out.println("[2] Find Maximum");
            System.out.println("[3] Calculate sum");
            System.out.println("[4] Check membership");
            System.out.println("[5] Search array");
            System.out.println("[6] Display values");
            System.out.println("[7] Display average");
            System.out.println("[8] Values greater than avg");
            System.out.println("[9] Exit");
            System.out.println("Enter choice [1-9]");
            choice = kbd.next().charAt(0);
            System.out.println();
            // process choice by calling additional methods
            switch (choice) {
                case '1':
                    fillArray(someArray);
                    break;
                case '2':
                    int max = max(someArray);
                    System.out.println("Maximum array value= " + max);
                    break;
                case '3':
                    int total = sum(someArray);
                    System.out.println("sum of array values= " + total);
                    break;
                case '4':
                    System.out.println("Enter value to find");
                    int value = kbd.nextInt();
                    boolean found = contains(value, someArray);
                    if (found) {
                        System.out.println(value + " is in the array");
                    } else {
                        System.out.println(value + " is not in the array");
                    }
                    break;
                case '5':
                    System.out.println("Enter value to find");
                    int item = kbd.nextInt();
                    int index = search(someArray, item);
                    if (index == -999) {
                        System.out.println("This value is not in the array");
                    } else {
                        System.out.println("This value is in the array index " +
                                index);
                    }
                    break;
                case '6':
                    System.out.println("Array values");
                    displayArrays(someArray);
                    break;
                case '7':
                    double avg = average(someArray);
                    System.out.print("The average of the array is ");
                    System.out.printf("%1.2f", avg);
                    break;
                case '8':
                    displayGreaterAvg(someArray);
                    break;
            }
        } while (choice != '9');
        System.out.println("Goodbye!");
    }

    // additional method
    // fills an array with values
    static void fillArray(int[] arrayIn) {
        Scanner kbd = new Scanner(System.in);
        for (int i = 0; i < arrayIn.length; i++) {
            System.out.println("Enter value");
            arrayIn[i] = kbd.nextInt();
        }
    }

    // returns the total of all the values held within an array
    static int sum(int[] arrayIn) {
        int sum = 0;
        for (int i = 0; i < arrayIn.length; i++) {
            sum += arrayIn[i];
        }
        return sum;
    }

    // return s the maximum value in an array
    static int max(int[] arrayIn) {
        int result = arrayIn[0];
        for (int i = 0; i < arrayIn.length; i++) {
            if (result < arrayIn[i]) {
                result = arrayIn[i];
            }
        }
        return result;
    }

    static boolean contains(int valueIn, int ... arrayin) {
        for (int currentElement : arrayin) {
            if (currentElement == valueIn) {
                return true;
            }
        }
        return false;
    }

    //returns the position of an item within an array
    // or -999 if the value is not present
    // within the array
    static int search(int[] arrayIn, int valueIn) {
        for (int i = 0; i < arrayIn.length; i++) {
            if (arrayIn[i] == valueIn) {
                return i;
            }
        }
        return -999;
    }

    static void displayArrays(int[] arrayIn) {
        for (int i = 0; i < arrayIn.length; i++) {
            System.out.println("array[" + i + "] = " + arrayIn[i]);
        }
    }

    static double average(int ... arrayIn){
        return  (double) sum(arrayIn) / arrayIn.length;
    }

    static void displayGreaterAvg(int ... arrayIn){
        double avg = average(arrayIn);
        for (int e: arrayIn) {
            if (e >= avg){
                System.out.print(e + " ");
            }
        }

    }

}
