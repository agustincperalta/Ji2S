package Exercises8;

public class TimeTable {

    private Booking[][] times;

    public TimeTable(int dpw, int ppd){
        this.times = new Booking[dpw - 1][ppd - 1];
    }

    public boolean makeBooking(int dpw, int ppd, Booking bookingIn) throws ArrayIndexOutOfBoundsException{
        try{
        if (times[dpw - 1][ppd - 1] == null) {
            times[dpw - 1][ppd - 1] = bookingIn;
            return true;
        } else {
            return false;
        }}
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Los indices superan los periodos disponibles");
            return false;
        }
    }

    public boolean cancelBooking(int dpw, int ppd) {
        if (times[dpw - 1][ppd - 1] != null) {
            times[dpw - 1][ppd - 1] = null;
            return true;
        } else {
            return false;
        }
    }

    public boolean isFree(int dpw, int ppd) {
        if (times[dpw - 1][ppd - 1] != null) {
            return false;
        } else {
            return true;
        }
    }

    public Booking getBooking(int dpw, int ppd) {
        if (dpw <= times.length || ppd <= times[dpw].length) {
            return times[dpw - 1][ppd - 1];
        } else {
            return null;
        }
    }

    public int numberOfDays() {
        return times.length;
    }

    public int numberOfPeriods() {
        return times[0].length;
    }
}
