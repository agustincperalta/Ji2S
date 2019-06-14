package Exercises8;

public class CircularShape {
    private double radius = 0;

    public CircularShape(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }

    public double calculateDiameter(){
        return radius * 2;
    }

}
