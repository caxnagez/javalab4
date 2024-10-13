package javacax;

import geometry2d.java.*;
import geometry3d.*;

public class Main {
    public static void main(String[] args) {
        try {
            Figure circle = new Circle(5);
            System.out.println(circle);

            Figure rectangle = new Rectangle(4, 6);
            System.out.println(rectangle);

            Cylinder cylinder = new Cylinder(circle, 10);
            System.out.println(cylinder);
            Figure invalidCircle = new Circle(-5); 
            Figure invalidRectangle = new Rectangle(4, -6); 
            Cylinder invalidCylinder = new Cylinder(rectangle, -10); 
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}