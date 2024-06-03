package edu.geometry;

public class Triangle extends Shape {

    //    A Triangle can be specified a few ways, including SAS (side-angle-side) and SSS (side-side-side).
//    Initially, we wish to provide support for SAS.
    private double side1;
    private double side2;
    private double angle;


    //ctors

    public Triangle(double side1, double side2, double angle) {
        this.side1 = side1;
        this.side2 = side2;
        this.angle = angle;
        setArea();
    }


    //business methods

    //accessor methods

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getAngle() {
        return angle;
    }

    private void setArea() {
        this.area = (0.5) * (side1 * side2 * Math.sin(Math.toRadians(angle)));
    }
//toString()


    @Override
    public String toString() {
        return "I'm a Triangle and my side1 is" + getSide1() + ", my side2 is " + getSide2() +
                ", my angle is " + getAngle() + ", and my area is equal to " + getArea() +
                '.';
    }
}

