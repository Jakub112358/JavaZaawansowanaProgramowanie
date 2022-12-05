package zad9;

import zad10.Movable;
import zad10.MoveDirection;
import zad11.Resizable;

import java.util.ArrayList;
import java.util.List;

//Zadanie 9.
//
//Stwórz klasę Point2D posiadającą pola double x, double y, gettery, settery oraz konstruktor.
// Następnie stwórz klasę Circle, która będzie miała konstruktor: Circle(Point2D center, Point2D point)
//
//Pierwszy parametr określa środek koła, drugi jest dowolnym punktem na okręgu.
// Na podstawie tych punktów, klasa Circle ma określać:
//• promień okręgu przy wywołaniu metody double getRadius()
//• obwód okręgu przy wywołaniu metody double getPerimeter()
//• pole okręgu przy wywołaniu metody double getArea()
//• (trudniejsze) trzy punkty na okręgu co 90 stopni od punktu podanego przy wywołaniu metody List getSlicePoints()
public class Circle implements Movable, Resizable {
    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius(){
        return Math.pow(Math.pow(point.getX()- center.getX(),2.0)+Math.pow(point.getY()- center.getY(),2.0),0.5);
    }
    public double getPerimeter(){
        return 2*Math.PI*getRadius();
    }
    public double getArea(){
        return Math.PI*Math.pow(getRadius(),2);
    }
    public List<Point2D> getSlicePoints(){
        double alpha = Math.acos((point.getX()-center.getX())/getRadius());
        System.out.println(alpha);
        List<Point2D> resultList = new ArrayList<>();
        resultList.add( new Point2D(center.getX()+getRadius()*Math.cos(alpha+Math.PI/2),center.getY()+getRadius()*Math.sin(alpha+Math.PI/2) ));
        resultList.add( new Point2D(center.getX()+getRadius()*Math.cos(alpha+Math.PI),center.getY()+getRadius()*Math.sin(alpha+Math.PI) ));
        resultList.add( new Point2D(center.getX()+getRadius()*Math.cos(alpha+Math.PI*3/2),center.getY()+getRadius()*Math.sin(alpha+Math.PI*3/2) ));
        return resultList;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        this.center.move(moveDirection);
        this.point.move(moveDirection);
    }

    @Override
    public void resize(double resizeFactor) {
        this.point.setX(this.center.getX()+(this.point.getX()-this.center.getX())*resizeFactor);
        this.point.setY(this.center.getY()+(this.point.getY()-this.center.getY())*resizeFactor);
    }
}
