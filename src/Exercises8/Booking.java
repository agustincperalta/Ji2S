package Exercises8;
/*
* Consider a scenario in which a university allows lecturers to borrow equipment.
The equipment is available for use 5 days a week and for 7 periods during each
day. When the equipment is booked for use, the details of the booking (room
number and lecturer name) are recorded. When no booking is recorded, the
equipment is available for use.
*
* (a) Create a Booking class defined in the UML diagram below:

* */
public class Booking {

    private String room;
    private String name;

    public Booking(String room, String name) {
        this.room = room;
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public String getName() {
        return name;
    }
}
