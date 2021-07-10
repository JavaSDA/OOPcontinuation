package com.company;

public class Circle {

    // Create properties of the circle as instance methods
    private int radius;

    // Create constructors
    public Circle() {

    }

    public Circle(int radius) {
        this.radius = radius;
    }

    // create methods to find the area and the circumference of the circle.

    public double getArea() {
        // Formula for the area of a circle is
        // PI * radius^2
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getCircumference() {
        // formula for the circumference of a circle
        // is 2 * PI * radius

        return 2 * Math.PI * radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
