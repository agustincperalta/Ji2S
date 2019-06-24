package Exercises9;

public class Sensor {
    private double pressure = -1;
    // Constructor 1
    public Sensor() {
        pressure = 0;
    }
    // Constructor 2
    public Sensor(double pressure) {
        this.pressure = pressure;
    }
    // Setter del valor pressure
    public boolean setPressure(double pressureIn){
        pressure = pressureIn;
        return true;
    }
    // Getter del valor pressure
    public double getPressure() {
        return pressure;
    }
}
