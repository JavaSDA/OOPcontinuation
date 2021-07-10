package com.company;

public class Average {
    // A method to take in an array of persons and find the average age.

    public static float averageOfValues(Person[] people) {
        // Initialize a variable to hold the sum of the values.
        float sum = 0;

        // Add the peoples' ages together
        for (int i = 0; i < people.length; i++) {

            sum += people[i].getAge();
        }

        // Return the average.
        return sum / people.length;
    }

}
