package Exercises9;

public class SafeSensor extends Sensor{
private double max = -1;


    public SafeSensor(double max) {
        super();
        this.max = max;


    }

    public SafeSensor(double pressure, double max) {
        super(pressure);
        this.max = max;
    }
}
