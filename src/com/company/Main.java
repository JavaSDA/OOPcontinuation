package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write a program that create an object of a person. User can state how many people to create
        //
        // Use the object to create multiple persons with the following attributes based on the user's input
        // - Name
        // -Age
        // - Hair color
        // add a method in a separate class called Average and put in a method
        // to collate the average of people based on the number of people entered.
        // Main, Average, Person


        // Initialize the scanner
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many people they want to create
//        System.out.print("How many people do you want to create?: ");
        // Create an array of the number of people they want to create
//        Person[] persons = new Person[scanner.nextInt()];

        // Repeatedly ask the user to create the people
//        for (int i = 0; i < persons.length; i++) {
//            // Create a new person.
//            Person person = new Person();
//
//            System.out.print("Enter the person's name: ");
//            person.setName(scanner.next());
//
//            System.out.print("Enter the person's hair color: ");
//            person.setHairColor(scanner.next());
//
//            System.out.print("Enter the person's age: ");
//            person.setAge(scanner.nextInt());

//            System.out.println();

            // Add the person to the person's array
//            persons[i] = person;
//        }

        // Find the average value.
//        System.out.println("The average age is " + Average.averageOfValues(persons));

        // 10 mins.
        // Write a class called Rectangle.
        // Take the length and breadth as properties of the rectangle.
        // Use constructor overloading to allow a user of class to either call.
        // an empty rectangle and setters to set the properties or allow them to
        // set the properties at the object creation.
        // add two methods to get the area and perimeter of an instance of that rectangle.

        // First constructor
//        Rectangle rectangle = new Rectangle();
//        System.out.print("Enter the length: ");
//        rectangle.setLength(scanner.nextInt());
//
//        System.out.print("Enter the width: ");
//        rectangle.setWidth(scanner.nextInt());

//        System.out.println("Area: " + rectangle.getArea());
//        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Second Constructor
//        Rectangle rectangle = new Rectangle(scanner.nextInt(), scanner.nextInt());

//        System.out.println("Area: " + rectangle.getArea());
//        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // 10 mins
        // Write a class called Circle.
        // Take the radius as property of the Circle.
        // Use constructor overloading to allow a user of class to either call.
        // an empty circle and setters to set the properties or allow them to
        // set the properties at the object creation.
        // add two methods to get the area and circumference of an instance of that circle.

        Circle firstCircle = new Circle();
        firstCircle.setRadius(7);

        System.out.println("Area of first circle is: " + firstCircle.getArea());
        System.out.println("Circumference of first circle is: " + firstCircle.getCircumference());

        Circle secondCircle = new Circle(14);
        System.out.println("Area of second circle is: " + secondCircle.getArea());
        System.out.println("Circumference of second circle is: " + secondCircle.getCircumference());


    }





}
