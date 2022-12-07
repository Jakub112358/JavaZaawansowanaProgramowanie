package zad32;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class CarSerialization {
    private LinkedList<Car> carList;
    String filePath = "C:\\Users\\Michał\\Documents\\kurs java\\carlist.txt";

    public CarSerialization(LinkedList<Car> carList) {
        this.carList = carList;
    }

    public void saveToFile() {

        //zapis stanu obiektu do pliku
        try (FileOutputStream fileOutputStream = new FileOutputStream(new File(filePath))) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(carList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Car> getFromFile() {
        //odczyt obiektu z pliku
        LinkedList<Car> resultList = new LinkedList<>();
        try (FileInputStream fileInputStream = new FileInputStream(new File(filePath))) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            //odczytujemy obiekt z pliku po czym rzutujemy go na wlasciwa klase (wlasciwy typ)
            resultList = (LinkedList<Car>) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resultList;
    }
}


