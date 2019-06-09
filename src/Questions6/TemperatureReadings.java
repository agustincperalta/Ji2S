package Questions6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays.*;

/*
 * Look back at the program from sect. 6.6, which read in
 * and displayed a series of temperature readings. Design
 * and write the code for an additional method, wasHot.
 * which displays all days that recorded temperatures of
 * 18° or over.
 * */
public class TemperatureReadings {
    public static void main(String[] args) {
        double[] temperature;
        temperature = enterTemps();
        displayTemps(temperature);
        wasHot(temperature);
    }

    // method to enter temperatures return an array
    static double[] enterTemps() {
        Scanner kbd = new Scanner(System.in);
        double[] temperatureOut = new double[7];
        for (int i = 0; i < temperatureOut.length; i++) {
            System.out.println("enter max temperature for day: " + (i + 1));
            temperatureOut[i] = kbd.nextDouble();
        }
        return temperatureOut;
    }

    static void displayTemps(double[] temperatureIn) {
        System.out.println();
        System.out.println("*** TEMPERATURES ENTERED ***");
        System.out.println();
        for (int i = 0; i < temperatureIn.length; i++) {
            System.out.println("day " + (i + 1) + " " + temperatureIn[i]);
        }
    }

    static void wasHot(double... temperatureIn) {
        System.out.println();
        System.out.println("*** TEMPERATURES ABOVE 18***");
        System.out.println();
        for (int i = 0; i < temperatureIn.length; i++){
            if (temperatureIn[i] >= 18){
                System.out.println("dia " + (i + 1) + " " + temperatureIn[i]);
            }
        }
    }
}
