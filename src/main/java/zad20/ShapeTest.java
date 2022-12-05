package zad20;

import zad21.Cone;
import zad21.Cube;

public class ShapeTest {
    public static void main(String[] args) {

        Cone cone = new Cone(2,3);
        Cube cube = new Cube(2);
        Shape[] shapes = new Shape[]{new Triangle(3, 4, 5),
                new Rectangle(7, 3),
                new Hexagon(2),
                cone,
                cube};

        for (Shape shape : shapes) {
            System.out.print("class: " + shape.getClass());
            System.out.print(", perimeter: " + shape.calculatePerimeter());
            System.out.println(", area: " + shape.calculateArea());
        }

        System.out.println("cone volume: " + cone.calculateVolume());
        System.out.println("cube volume: " + cube.calculateVolume());

        cube.fill(7);
        cube.fill(8);
        cube.fill(9);
    }
}
