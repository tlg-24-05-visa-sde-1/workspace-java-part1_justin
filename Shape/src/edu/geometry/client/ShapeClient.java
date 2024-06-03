package edu.geometry.client;

import edu.geometry.*;

public class ShapeClient {

    /* Todo - not sure where to put the method to add shapes to the shape array so I just did it by
     *      referencing a spot in the array for each shape
     */

    public static void main(String[] args) {

        Shape[] shapes = new Shape[50];

        //create a circle and add to array
        Shape circle1 = new Circle(5.0);
        shapes[0] = circle1;


        //create a rectangle and add to array.
        Shape rect1 = new Rectangle(12.0, 5.0);
        shapes[1] = rect1;


        //create a few triangles triangle and add to array
        Shape tri1 = new Triangle(5.0, 3.0, 12.0);
        shapes[2] = tri1;
        Shape tri2 = new Triangle(10.0, 15.0, 80.0);
        shapes[3] = tri2;

        //printing out all the non-null objects in the array
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                System.out.println(shapes[i]);
                System.out.println();
            }
        }

        //adding up the areas of each shape in the array
        double areaTotal = 0.0;

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                areaTotal += shapes[i].getArea();
            }
        }
        System.out.println("The total area of the shapes in the array is " + areaTotal + ".");
    }
}
