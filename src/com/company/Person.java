package com.company;

public class Person {

    // if the field is a constant then make
    // the field final and the identifier should all caps
    // the field should also not be private.

    // Encapsulation.
    private String name;
    private int age;
    private String hairColor;

    // alt + insert(shortcut to generate getters and setters)

    // default constructor is already created by default
    // and takes no values
    public Person() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHairColor() {
        return this.hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}
