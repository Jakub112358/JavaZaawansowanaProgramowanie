package zad13;
//Zadanie 13.
//
//Stwórz klasę CarService, która będzie zawierać w sobie listę aut, oraz będzie realizować poniższe metody:
//
//    dodawanie aut do listy,
//    usuwanie auta z listy,
//    zwracanie listy wszystkich aut,
//    zwracanie aut z silnikiem V12,
//    zwracanie aut wyprodukowanych przed rokiem 1999,
//    zwracanie najdroższego auta,
//    zwracanie najtańszego auta,
//    zwracanie auta z co najmniej 3 producentami,
//    zwracanie listy wszystkich aut posortowanych zgodnie z przekazanym parametrem: rosnąco/malejąco,

//tests in zad12.CarTest class

import zad12.Car;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private List<Car> carList;

    public CarService() {
        this.carList = new ArrayList<>();
    }

    public void addCar(Car car) {
        this.carList.add(car);
    }

    public boolean deleteCar(Car car) {
        return carList.remove(car);
    }

    public List<Car> getAllCars() {
        return carList;
    }

    public List<Car> getCarsWithV12Engine() {
        return carList.stream()
                .filter(c -> c.getEngineType().equals(Car.EngineType.V12))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsProducedBefore1999(){
        return carList.stream()
                .filter(car -> car.getDateOfProduction().isBefore(LocalDate.of(1999,1,1)))
                .collect(Collectors.toList());
    }
    public Car getTheMostExpensiveCar(){
        List<Car> carsByValue = carList.stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .limit(1).toList();
        return carsByValue.get(0);
    }

    public Car getTheCheapestCar(){
        List<Car> carsByValue = carList.stream()
                .sorted(Comparator.comparing(Car::getPrice))
                .limit(1).toList();
        return carsByValue.get(0);
    }
    public List<Car> getCarsWithAtLeast3Manufacturers(){
        return carList.stream()
                .filter(car -> car.getProducers().size()>2)
                .collect(Collectors.toList());
    }
    public List<Car> getCarListSorted(CarParameter carParameter, boolean ascending){
        if(ascending){

            return switch (carParameter){
                case NAME -> carList.stream().sorted(Comparator.comparing(Car::getName)).collect(Collectors.toList());
                case MODEL -> carList.stream().sorted(Comparator.comparing(Car::getModel)).collect(Collectors.toList());
                case PRICE -> carList.stream().sorted(Comparator.comparing(Car::getPrice)).collect(Collectors.toList());
                case DATE_OF_PRODUCTION -> carList.stream().sorted(Comparator.comparing(Car::getDateOfProduction)).collect(Collectors.toList());
                case NUMBER_OF_MANUFACTURERS -> carList.stream().sorted(Comparator.comparing(car -> car.getProducers().size())).collect(Collectors.toList());
                case ENGINE_TYPE -> carList.stream().sorted(Comparator.comparing(Car::getEngineType)).collect(Collectors.toList());
            };
        }else {
            return switch (carParameter){
                case NAME -> carList.stream().sorted(Comparator.comparing(Car::getName).reversed()).collect(Collectors.toList());
                case MODEL -> carList.stream().sorted(Comparator.comparing(Car::getModel).reversed()).collect(Collectors.toList());
                case PRICE -> carList.stream().sorted(Comparator.comparing(Car::getPrice).reversed()).collect(Collectors.toList());
                case DATE_OF_PRODUCTION -> carList.stream().sorted(Comparator.comparing(Car::getDateOfProduction).reversed()).collect(Collectors.toList());
                case NUMBER_OF_MANUFACTURERS -> carList.stream().sorted((car1,car2) -> car2.getProducers().size() - car1.getProducers().size()).collect(Collectors.toList());
                case ENGINE_TYPE -> carList.stream().sorted(Comparator.comparing(Car::getEngineType).reversed()).collect(Collectors.toList());
            };
        }

    }

    public enum CarParameter{
        NAME,
        MODEL,
        PRICE,
        DATE_OF_PRODUCTION,
        NUMBER_OF_MANUFACTURERS,
        ENGINE_TYPE
    }
}
