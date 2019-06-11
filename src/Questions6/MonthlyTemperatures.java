package Questions6;
/*
Consider the MonthlyTemperatures program of Sect. 6.9.4. Write an
additional method, max, that returns the maximum temperature
recorded in the given two-dimensional array.
Hint: look back at the algorithm for finding the maximum value
in a onedimensional array in Sect. 6.8.1
 */

import java.util.Scanner;

public class MonthlyTemperatures {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        char choice;

        double[][] temperature = new double[4][7]; // create 2D array
        //offer menu
        do {
            System.out.println();
            System.out.println("[1] Enter temperatures");
            System.out.println("[2] Display all");
            System.out.println("[3] Display one week");
            System.out.println("[4] Display day of the week");
            System.out.println("[5] Display max temperature of all");
            System.out.println("[6] Exit");
            System.out.println("Enter choice [1-6]:");
            choice = kbd.next().charAt(0);
            System.out.println();
            // process choice by calling additional methods
            switch (choice) {
                case '1':
                    enterTemps(temperature);
                    break;
                case '2':
                    displayAllTemps(temperature);
                    break;
                case '3':
                    displayWeek(temperature);
                    break;
                case '4':
                    displaysDays(temperature);
                    break;
                case '5':
                    System.out.println("The maximum temperature is: " + max(temperature));
                    break;
                case '6':
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("ERROR: options 1-6 only!");
            }
        } while (choice != '6');
    }

    // method to enter temperatures into the 2D array requires a nested loop
    static void enterTemps(double[][] temperatureIn) {
        Scanner keyboard = new Scanner(System.in);
        // The outer loop controls the week number
        for (int week = 1; week <= temperatureIn.length; week++) {
            // the inner loop controls the day number
            for (int day = 1; day <= temperatureIn[0].length; day++) {
                System.out.println("enter temperature for week" + week +
                        " and day " + day);
                temperatureIn[week - 1][day - 1] = keyboard.nextDouble();
            }
        }
    }

    // method to display all temperatures in the 2D array requires a nested loop
    static void displayAllTemps(double[][] temperatureIn) {
        System.out.println();
        System.out.println("*** TEMPERATURES ENTERED ***");
        //The outer loop control week number
        for (int week = 1; week <= temperatureIn.length; week++) {
            // The inner loop control day number
            for (int day = 1; day <= temperatureIn[0].length; day++) {
                System.out.println("week " + week + " day " + day +
                        " : " + temperatureIn[week - 1][day - 1]);
            }
        }
    }

    // method to display temperatures for a single week requires a single loop
    static void displayWeek(double[][] temperatureIn) {
        Scanner kbd = new Scanner(System.in);
        int week;
        // enter week number
        System.out.println("Enter number (1-4): ");
        week = kbd.nextInt();
        // input validation: week number should be between 1 and 4
        while (week < 1 || week > 4) {
            System.out.println("Invalid week number");
            System.out.println("Enter again (1-4) only:");
            week = kbd.nextInt();
        }
        // Display temperatures for given week
        System.out.println();
        System.out.println("***TEMPERATURES ENTERED FOR WEEK" + week + "***");
        System.out.println();
        // week number is fixed so loop required to process day numbers only
        for (int day = 1; day <= temperatureIn[0].length; day++) {
            System.out.println("week " + week + " day "
                    + day + " : " + temperatureIn[week - 1][day - 1]);
        }
    }

    // method to display temperatures for a single day of each week requires a single loop
    static void displaysDays(double[][] temperatureIn) {
        Scanner kbd = new Scanner(System.in);
        int day;
        // enter day number
        System.out.println("Enter day number [1-7]: ");
        day = kbd.nextInt();
        // input validation: day number should be between 1 and 7
        while (day < 1 || day > 7) {
            System.out.println("Invalid number!!");
            System.out.println("Enter again (1-7 only): ");
            day = kbd.nextInt();
        }
        // display temperatures for given day of the week
        System.out.println();
        System.out.println("*** TEMPERATURES ENTERED BY FOR DAY " + day + " ***");
        System.out.println();
        // day of number is fixed so loop required to process week number only
        for (int week = 1; week <= temperatureIn.length; week++) {
            System.out.println("week " + week + " day " + day + " : "
                    + temperatureIn[week - 1][day - 1]);
        }
    }

    static double max(double[][] temperatureIn) {
        double result = temperatureIn[0][0];
        for (int i = 1; i <= temperatureIn.length; i++) {

            for (int j = 1; j <= temperatureIn[0].length; j++) {
                if (result < temperatureIn[i - 1][j - 1]) {
                    result = temperatureIn[i - 1][j - 1];
                }
            }
        }
        return result;
    }

}
 

