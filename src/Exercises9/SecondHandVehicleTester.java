package Exercises9;

public class SecondHandVehicleTester {
    public static void main(String[] args) {
        SecondHandVehicle platina = new SecondHandVehicle("A8522", "Nissan", 2001,
                56000, 0);

        System.out.println("The car has " + platina.getNumberOfOwners() + " owners");
        if (platina.hasMultipleOwners()){
            System.out.println("the car has multiple owners");
        }else{
            System.out.println("the car only has one owner");
        }

        System.out.println("The car age is "+platina.calculateAge(2019)  + " years");
    }
}
