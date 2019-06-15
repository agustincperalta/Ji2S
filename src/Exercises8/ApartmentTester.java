package Exercises8;

import Questions7.Oblong;
import com.github.javafaker.Faker;

import java.util.Scanner;

public class ApartmentTester {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        Apartment a = new Apartment();
        Faker f = new Faker();
        //System.out.println(a.add(new Oblong(2, 2)));
        System.out.println("How many rooms does you apartment have?");
        int numberRooms = kbd.nextInt();

        // Randomized values
        for (int i = 0; i < numberRooms; i++) {
            a.add(new Oblong(
                    f.number().randomDouble(2, 1, 20),
                    f.number().randomDouble(2, 1, 20)));
        }


        for (int i = 0; i < a.getRooms().size(); i++) {
            System.out.println("Room" + (i + 1));
            System.out.println("Area: " + a.getRoomArea(i));
            System.out.println("Height: " + a.getRoomHeight(i));
            System.out.println("Length: " + a.getRoomLength(i));
            System.out.println();
        }

        if (a.getRoomArea(21) == -999.0){
            System.out.println("Room not found");
        }
        else{
            System.out.println(a.getRoomArea(21));
        }

    }
}
