package zad21;

import java.util.OptionalDouble;

public class Cube extends Shape3D{
    private double dimensionA;

    public Cube(double dimensionA) {
        this.dimensionA = dimensionA;
    }

    public double getDimensionA() {
        return dimensionA;
    }

    @Override
    public OptionalDouble calculatePerimeter() {
        return OptionalDouble.empty();
    }

    @Override
    public double calculateArea() {
        return 6*Math.pow(dimensionA,2.0);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(dimensionA,3.0);
    }
}
