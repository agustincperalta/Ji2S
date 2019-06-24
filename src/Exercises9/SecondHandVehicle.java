package Exercises9;

public class SecondHandVehicle extends Vehicle{

    private int numberOfOwners = 0;

    // Constructor que llama al constructor de la super clase
    public SecondHandVehicle(String regNo, String make, int yearOfManufacture, double value, int numberOfOwners){
        super(regNo, make, yearOfManufacture, value);
        if (numberOfOwners >= 1)
        this.numberOfOwners = numberOfOwners;
        else{
            this.numberOfOwners = 1;
            System.out.println("Invalid number of owners, setted to 1");
        }
    }

    public int getNumberOfOwners(){
        return numberOfOwners;
    }

    public boolean hasMultipleOwners(){
        if (numberOfOwners > 1){
            return true;
        }
        return false;
    }
}
