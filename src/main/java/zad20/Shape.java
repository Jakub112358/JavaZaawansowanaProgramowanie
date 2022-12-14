package zad20;

import java.util.OptionalDouble;

//Stwórz abstrakcyjną klasę Shape wraz z abstrakcyjnymi metodami calculatePerimeter() służącą do obliczania obwodu oraz calculateArea() służącą do obliczania powierzchni.
//Stwórz klasy Rectangle, Triangle, Hexagon, rozszerzając klasę Shape, odpowiednio implementując metody abstrakcyjne. Sprawdź poprawność działania.
public abstract class Shape {
    public abstract OptionalDouble calculatePerimeter();

    public abstract double calculateArea();
}
