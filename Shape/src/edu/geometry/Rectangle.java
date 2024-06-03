package edu.geometry;

public class Rectangle extends Shape {
    //fields
    private double length;
    private double width;
    //ctors

    public Rectangle() {
        super();
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        setArea();
    }


    //accessor methods

    private void setArea() {
        this.area = (length * width);
    }

    public double getArea() {
        return area;
    }

    public double getLength() {
        return length;
    }


    public double getWidth() {
        return width;
    }

    //toString()
    public String toString() {
        return "I'm a rectangle, and my width is " + getWidth() + ", my length is " +
                getLength() + ", and my area is " + getArea() + ".";
    }

}
