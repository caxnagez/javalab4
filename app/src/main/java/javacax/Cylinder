package geometry3d;

import geometry2d.java.*;

public class Cylinder {
    private Figure base;
    private double height;

    public Cylinder(Figure base, double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        this.base = base;
        this.height = height;
    }

    public double volume() {
        return base.area() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "base=" + base +
                ", height=" + height +
                ", volume=" + volume() +
                '}';
    }
}