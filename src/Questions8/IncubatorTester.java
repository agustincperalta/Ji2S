package Questions8;

public class IncubatorTester {

    public static void main(String[] args) {
        Incubator i = new Incubator();

        System.out.println("The initial temp is: " + i.getTemperature());
        i.increaseTemp();
        System.out.println("Testing increase temp: " + i.getTemperature());
        i.increaseTemp();
        i.increaseTemp();
        i.increaseTemp();
        i.increaseTemp();
        System.out.println("Incubator is in the max temp: " + i.getTemperature());

        System.out.println("Same: " + i.getTemperature());

        if (!i.increaseTemp()){
            System.out.println("The Incubator are reaching the Max Temp");
        }

        for (int j = 0; j < 20 ; j++) {
            i.decreaseTemp();
        }

        if (!i.decreaseTemp()){
            System.out.println("The Incubator are reaching the Min Temp");
        }

        System.out.println("Actual: " + i.getTemperature());


    }
}
