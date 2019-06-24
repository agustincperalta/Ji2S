package Exercises9;

public class Sensor {
    private double pressure = -1;

    public Sensor() {
        pressure = 0;
    }

    public Sensor(double pressure) {
        this.pressure = pressure;
    }

    public boolean setPressure(double pressureIn){
        pressure = pressureIn;
        return true;
    }

    public double getPressure() {
        return pressure;
    }
}
