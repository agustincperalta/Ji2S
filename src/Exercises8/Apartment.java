package Exercises8;

import Questions7.Oblong;

import java.util.ArrayList;

public class Apartment {
    private ArrayList<Oblong> rooms = new ArrayList<>();
    /* TODO utilizar metodo contains() de ArrayList para verificar room */

    public ArrayList<Oblong> getRooms() {
        return rooms;
    }

    public boolean add(Oblong room) {
        rooms.add(room);
        return true; // TODO abstraer valor de salida false
    }

    public double getRoomArea(int roomNumber) {
        if (roomNumber <= rooms.size())
            return rooms.get(roomNumber).calculateArea();
        else
            return -999;
    }

    public double getRoomLength(int roomNumber) {
        if (roomNumber <= rooms.size())
            return rooms.get(roomNumber).getLength();
        else
            return -999;
    }

    public double getRoomHeight(int roomNumber) {
        if (roomNumber <= rooms.size())
            return rooms.get(roomNumber).getHeight();
        else
            return -999;
    }

}
