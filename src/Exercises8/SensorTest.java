package Exercises8;

public class SensorTest {

    public static void main(String[] args) {
        Sensor s1 = new Sensor(); // Sensor 1 pressure is set to 0
        Sensor s2 = new Sensor(52.41); // overriden method

        System.out.println(s1.getPressure()); // 0
        System.out.println(s2.getPressure()); // 52.41

        if (s1.setPressure(21.23)) {
            System.out.println("Pressure S1 updated"); // <-- This one if positive
        } else {
            System.out.println("Error: Invalid Input"); // <-- This one if negative
        }

        System.out.println("New values:");
        System.out.println("S1: " + s1.getPressure());
        System.out.println("S2: " + s2.getPressure());
    }
}
