package zad20;

import java.util.OptionalDouble;

public class Rectangle extends Shape {
    private double dimensionA;
    private double dimensionB;

    public Rectangle(double dimensionA, double dimensionB) {
        //dimensions should be validated here...
        this.dimensionA = dimensionA;
        this.dimensionB = dimensionB;
    }

    public double getDimensionA() {
        return dimensionA;
    }

    public double getDimensionB() {
        return dimensionB;
    }

    @Override
    public OptionalDouble calculatePerimeter() {
        return OptionalDouble.of( 2 * dimensionA + 2 * dimensionB);
    }

    @Override
    public double calculateArea() {
        return dimensionA * dimensionB;
    }
}
