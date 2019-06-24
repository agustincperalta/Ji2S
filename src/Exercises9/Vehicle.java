package Exercises9;
/*
* (a) Implement the Vehicle and the SecondHandVehicle classes of self-test question 1
* You should note that:
*
* + The calculateAge method of Vehicle accepts an integer representing
* the current year, and returns tha age of the vehicle as calculated
* by substracting the year of manufacture form the current year.
*
* +The hasMultiple Owners methods of SecondHandVehicle should return true
* if the numberOfOwners attribute has a value greater than 1, of false otherwise
*
* (b) Write a tester class that test all the methods of the SecondHandVehicle
* class
* */
public class Vehicle {

    //Miembros privados de la clase
    private String regNo = "";
    private String make = "";
    private int yearOfManufacture = 0;
    private double value = 0;

    public Vehicle(String regNo, String make, int yearOfManufacture, double value) {
        this.regNo = regNo;
        this.make = make;
        this.yearOfManufacture = yearOfManufacture;
        this.value = value;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getMake() {
        return make;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int calculateAge(int currentYear){
        return currentYear - yearOfManufacture;
    }
}
