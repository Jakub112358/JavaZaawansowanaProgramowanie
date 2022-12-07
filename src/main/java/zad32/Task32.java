package zad32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Zadanie 32.
//
//Napisz program, który będzie w stanie zapisać listę elementów (np. aut)
// do pliku w takim formacie, aby był również w stanie odczytać ten plik
// i stworzyć nową listę elementów i wypisać ją w konsoli.
public class Task32 {
    public static void main(String[] args) {
        LinkedList<Car> carList = new LinkedList<>();
        carList.add(new Car("car1",100));
        carList.add(new Car("car2",110));
        carList.add(new Car("car3",120));

        CarSerialization carSerialization = new CarSerialization(carList);
        carSerialization.saveToFile();

        List<Car> newCarList = carSerialization.getFromFile();
        System.out.println(newCarList);
    }
}
