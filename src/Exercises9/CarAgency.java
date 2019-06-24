package Exercises9;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Write a menu-driven program that uses an ArrayList to hold
 * Vehicles. The menu should offer the following options:
 *
 * 1. Add a vehicle
 * 2. Display a list of vehicle details
 * 3. Delete a vehicle
 * 4. Quit
 *
 * */
public class CarAgency {
    public static void main(String[] args) {
        // Crea el objeto ArrayList para guardar Vehicles
        ArrayList<Vehicle> carLot1 = new ArrayList<>();
        int index = 1;
        Scanner kbd = new Scanner(System.in);
        int choice = 0;
        do {
            menu();
            choice = kbd.nextInt();
            while (choice <= 0 || choice > 5) {
                System.out.println("Invalid number, please try again");
                choice = kbd.nextInt();
            }

            switch (choice) {
                case 1:
                    Scanner kbd2 = new Scanner(System.in);
                    System.out.println("give me the manufaturing");
                    String make = kbd2.nextLine();
                    System.out.println("give me the year of manufacture");
                    int yearOfManufacture = kbd2.nextInt();
                    System.out.println("give me the value");
                    double value = kbd2.nextDouble();
                    carLot1.add(new Vehicle(Integer.toString(index++), make, yearOfManufacture, value));
                    break;
                case 2:
                    for (Vehicle e : carLot1
                    ) {
                        System.out.println("Register number: " + e.getRegNo() + " Manufacturing: " + e.getMake() +
                                " Year of Manufacture: " + e.getYearOfManufacture() + " Value: " + e.getValue());
                    }
                    break;
                case 3:
                    Scanner kbd3 = new Scanner(System.in);
                    System.out.println("Please give me the register number");
                    int removeRegNo = kbd3.nextInt();
                    try {
                        System.out.println("Register" + carLot1.remove(removeRegNo - 1).getRegNo() + " removed");
                    }catch (IndexOutOfBoundsException e){
                        System.out.println("El registro no se encuentra");
                    }

            }
        } while (choice != 4);
        System.out.println("Goodbye!");


    }

    public static void menu() {
        System.out.println("1. Add a vehicle");
        System.out.println("2. Display a list of vehicle details");
        System.out.println("3. Delete a vehicle");
        System.out.println("4. Quit");
    }


}
