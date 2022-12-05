package zad20;

import java.util.OptionalDouble;

//I assume that hexagon is regular...
public class Hexagon extends Shape{
    private double dimensionA;

    public Hexagon(double dimensionA) {
        //dimensions should be validated here...
        this.dimensionA = dimensionA;
    }

    public double getDimensionA() {
        return dimensionA;
    }

    @Override
    public OptionalDouble calculatePerimeter() {
        return OptionalDouble.of(6*dimensionA);
    }

    @Override
    public double calculateArea() {
        return 3*Math.pow(dimensionA,2.0)*Math.sqrt(3.0)/2;
    }
}
