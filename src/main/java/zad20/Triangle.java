package zad20;

import java.util.OptionalDouble;

public class Triangle extends Shape {
    private double dimensionA;
    private double dimensionB;
    private double dimensionC;

    public Triangle(double dimensionA, double dimensionB, double dimensionC) {
        //dimensions should be validated here...
        this.dimensionA = dimensionA;
        this.dimensionB = dimensionB;
        this.dimensionC = dimensionC;
    }

    public double getDimensionA() {
        return dimensionA;
    }

    public double getDimensionB() {
        return dimensionB;
    }

    public double getDimensionC() {
        return dimensionC;
    }

    @Override
    public OptionalDouble calculatePerimeter() {
        return OptionalDouble.of(dimensionA + dimensionB + dimensionC);
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter().getAsDouble() / 2;
        return Math.sqrt(p * (p - dimensionA) * (p - dimensionB) * (p - dimensionC));
    }
}
