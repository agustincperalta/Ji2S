package Questions8;

public class Incubator {

    private int temperature = -1;
    public static int MAX = 10;
    public static int MIN = -10;

    public Incubator() {
        temperature = 5;
    }

    public int getTemperature() {
        return temperature;
    }

    public boolean increaseTemp() {
        if (temperature >= MAX) {
            return false;
        } else {
            temperature++;
            return true;
        }
    }

    public boolean decreaseTemp() {
        if (temperature <= MIN) {
            return false;
        } else {
            temperature--;
            return true;
        }
    }
}
