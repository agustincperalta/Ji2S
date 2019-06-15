package Exercises8;

public class TestTimeTable {

    public static void main(String[] args) {

        TimeTable w1 = new TimeTable(5, 7);
        Booking b1 = new Booking("310", "Agustin Peralta");


        boolean booking = w1.makeBooking(1, 9, b1);
        if (booking) {
            System.out.println("Added");
        } else {
            System.out.println("Unavailable");
        }


        boolean booking2 = w1.makeBooking(1, 1, b1);
        if (booking2) {
            System.out.println("Added");
        } else {
            System.out.println("Unavailable");
        }
        // w1.getBooking(1, 7);

        if (w1.cancelBooking(1, 1)) {
            System.out.println("Canceled");
        } else {
            System.out.println("Nothing to cancel!");
        }

        if (w1.cancelBooking(1, 1)) {
            System.out.println("Canceled");
        } else {
            System.out.println("Nothing to cancel!");
        }

        if (w1.isFree(1, 2)) {
            System.out.println("It's free!");
        } else {
            System.out.println("Unavailable");

        }
        boolean booking3 = w1.makeBooking(2, 3, new Booking("232", "Sandra"));
        if (booking3) {
            System.out.println("Added");
        } else {
            System.out.println("Unavailable");
        }

        if (w1.isFree(2, 3)) {
            System.out.println("It's free!");
        } else {
            System.out.println("Ocuppied by: ");
        }

        Booking w2_3 = w1.getBooking(2, 3);

        System.out.println(w2_3.getName());
        System.out.println(w2_3.getRoom());

        System.out.println(w1.numberOfDays());
        System.out.println(w1.numberOfPeriods());

    }
}
