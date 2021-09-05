package chapter6;

import java.awt.*;

/*
 * Write a class that creates instances of the `Rectangle` class to find the
 * total area of two rooms in a house.
 */
public class HomeAreaCalculator {
    public static void main (String arg[]){
        /*******************
         * RECTANGLE 1
         ********************/

        //Create instance of Rectangle class
        Rectangles room1 = new Rectangles();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();


        /*******************
         * RECTANGLE 2
         ********************/

        //Create instance of Rectangle class
        Rectangles room2 = new Rectangles(30,75);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Area of both rooms: " + totalArea);

    }

}
