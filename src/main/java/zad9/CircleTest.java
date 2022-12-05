package zad9;

import zad10.MoveDirection;

public class CircleTest {


    public static void main(String[] args) {
        Point2D center = new Point2D(0,0);
        Point2D point = new Point2D(3,0);
        Circle circle = new Circle(center, point);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println(circle.getSlicePoints());
        circle.move(new MoveDirection(0,3));
        circle.resize(1.5);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println(circle.getSlicePoints());
    }
}
