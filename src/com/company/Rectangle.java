package com.company;

public class Rectangle {

    // Only all uppercase on your fields if they are constants.
    // when you create a constant. It's typically not going to be private.



    // Create the properties of the rectangle
//    public static final int RECTANGLE_CONSTANT = 2;
    // Encapsulation: is methodology of hiding data from being
    // directly accessed.
    private int length;
    private int width;

    // empty constructor
    public Rectangle() {
    }



    // pass in the values at object creation
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // windows keyboards: alt + insert
    // mac Keyboards: control + insert
    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // Get perimeter method.
    public int getPerimeter() {
        // Formula for perimeter of a rectangle is
        // 2 * (l + w)
        return 2 * (this.length + this.width);
    }

    // Get area method
    public int getArea() {
        // formula for the area of a rectangle is
        // l * w
        return this.length * this.width;
    }
}
