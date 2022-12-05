package zad21;

import zad20.Shape;
import zad22.Fillable;
////Zadanie 21.
////
////Stwórz abstrakcyjną klasę 3DShape rozszerzającą klasę Shape z poprzedniego zadania. Dodaj dodatkową metodę calculateVolume().
////Stwórz klasy Cone oraz Qube rozszerzając klasę 3DShape, odpowiednio implementując metody abstrakcyjne. Sprawdź poprawność działania.

//tests are in zad20 ShapeTest class

public abstract class Shape3D extends Shape implements Fillable {
    public abstract double calculateVolume();

    @Override
    public void fill(double waterVolume) {
        if(waterVolume>calculateVolume()){
            System.out.println("too much water 💧💧💧💧💧");
        } else if (waterVolume<calculateVolume()) {
            System.out.println("not enough water 😱😱😱😱");
        } else {
            System.out.println("perfect amount of water 🎈🎈🎈🎈🎈🎈");
        }
    }
}
