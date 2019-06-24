package Exercises9;
/*
 * (a) Implement the SafeSensor class of self-test question 3. You will
 * need to ensure that the Sensor class itself is accessible to the compiler
 *
 * (b) Write a tester class to test the methods of the SafeSensor class
 * */

public class SafeSensor extends Sensor {
    private double max = -1;

    // Primer constructor con setter de max value
    public SafeSensor(double max) {
        super();
        this.max = max;
        super.setPressure(0);
    }

    // Segundo constructor para setter de la presion y el valor maximo
    public SafeSensor(double pressure, double max) {
        super(pressure);
        this.max = max;
        if (pressure > max){
            super.setPressure(max);
            System.out.println("pressure > max, Pressure seated to max value");
        }
    }

    @Override
    public boolean setPressure(double pressureIn) {
        if (pressureIn < max)
            return super.setPressure(pressureIn);
        else
            return false;
    }

    public double getMax() {
        return max;
    }
}

