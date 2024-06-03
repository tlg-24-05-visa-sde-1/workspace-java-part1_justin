package edu.geometry;

public class Circle extends Shape {

    //fields
    private double radius;

    //ctors

    public Circle() {
        super();
    }

    public Circle(double radius) {
        this.radius = radius;
        setArea();
    }

    //accessors
    public double getRadius() {
        return radius;
    }
    //no setter for radius so it's immutable

    private void setArea() {
        this.area = Math.PI * Math.pow(radius, 2);
    }

    public double getArea() {
        return area;
    }
    //toString

    @Override
    public String toString() {
        return "I'm a circle and my radius is " + getRadius() + " and my area is " + getArea() + ".";
    }
}

