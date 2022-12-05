package zad21;

import java.util.OptionalDouble;

// I assume that cone is a right circular cone.
public class Cone extends Shape3D{
    private double radius;
    private double height;
    private double slantHeight;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
        this.slantHeight=Math.sqrt(Math.pow(radius,2)+Math.pow(height,2));
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public OptionalDouble calculatePerimeter() {
        return OptionalDouble.empty();
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*(radius+slantHeight);
    }

    @Override
    public double calculateVolume() {
        return 1.0/3.0*Math.PI*Math.pow(radius,2.0)*height;
    }
}
