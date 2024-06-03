package edu.geometry;

import org.w3c.dom.ls.LSOutput;

//abstract class to be extended by specific shapes.  They all must have an Area
public abstract class Shape {

    //fields
    double area;

    //ctors

    public Shape() {

    }

    //business methods

    //accessors
    public double getArea() {
        return area;
    }

    //toString()
    public String toString() {
        return "I'm a shape and I have an area";
    }
}

