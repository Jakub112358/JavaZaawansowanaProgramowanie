package zad12;

import zad13.CarService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        List<Manufacturer> manufacturerList1 = new ArrayList<>();
        List<Manufacturer> manufacturerList2 = new ArrayList<>();
        List<Manufacturer> manufacturerList3 = new ArrayList<>();
        Manufacturer manufacturer1 =  new Manufacturer("name1",LocalDate.of(1992,8,12), "Zimbabwe");
        Manufacturer manufacturer2 =  new Manufacturer("name2",LocalDate.of(1992,8,12), "Zimbabwe");
        Manufacturer manufacturer3 =  new Manufacturer("name3",LocalDate.of(1992,8,12), "Zimbabwe");
        Manufacturer manufacturer4 =  new Manufacturer("name4",LocalDate.of(1992,8,12), "Zimbabwe");
        Manufacturer manufacturer5 =  new Manufacturer("name5",LocalDate.of(1992,8,12), "Zimbabwe");
        Manufacturer manufacturer6 =  new Manufacturer("name6",LocalDate.of(1992,8,12), "Zimbabwe");
        manufacturerList1.add(manufacturer1);
        manufacturerList1.add(manufacturer2);
        manufacturerList1.add(manufacturer3);
        manufacturerList1.add(manufacturer4);
        manufacturerList2.add(manufacturer1);
        manufacturerList2.add(manufacturer5);
        manufacturerList3.add(manufacturer6);

       Car car1 = new CarBuilder()
               .withModel("astra")
               .withName("opel")
               .withPrice(BigDecimal.valueOf(30_000))
               .withEngineType(Car.EngineType.V12)
               .withDateOfProduction(LocalDate.of(1998,12,31))
               .withProducers(manufacturerList1)
               .toCar();

        Car car2 = new CarBuilder()
                .withModel("panda")
                .withName("fiat")
                .withPrice(BigDecimal.valueOf(20_000))
                .withEngineType(Car.EngineType.S3)
                .withDateOfProduction(LocalDate.of(1999,1,1))
                .withProducers(manufacturerList2)
                .toCar();

        Car car3 = new CarBuilder()
                .withModel("optima")
                .withName("kia")
                .withPrice(BigDecimal.valueOf(50_000))
                .withEngineType(Car.EngineType.V8)
                .withDateOfProduction(LocalDate.of(2015,10,5))
                .withProducers(manufacturerList3)
                .toCar();

        CarService carService = new CarService();
        carService.addCar(car1);
        carService.addCar(car2);
        carService.addCar(car3);
        System.out.println("all cars: " + carService.getAllCars());
        System.out.println("cars with V12: " + carService.getCarsWithV12Engine());
        System.out.println("cars produced before 1999: " + carService.getCarsProducedBefore1999());
        System.out.println("the most expensive car: " + carService.getTheMostExpensiveCar());
        System.out.println("the cheapest car: " + carService.getTheCheapestCar());
        System.out.println("cars with minimum 3 manufacturers: " + carService.getCarsWithAtLeast3Manufacturers());
        System.out.println("sorted by name: " +carService.getCarListSorted(CarService.CarParameter.NAME,true));
        System.out.println("sorted by engine type: " + carService.getCarListSorted(CarService.CarParameter.ENGINE_TYPE,true));
        System.out.println("sorted by number of manufacturers: " + carService.getCarListSorted(CarService.CarParameter.NUMBER_OF_MANUFACTURERS,true));
        System.out.println("sorted by name, descending: " +carService.getCarListSorted(CarService.CarParameter.NAME,false));
        System.out.println("sorted by engine type, descending: " + carService.getCarListSorted(CarService.CarParameter.ENGINE_TYPE,false));
        System.out.println("sorted by number of manufacturers, descending: " + carService.getCarListSorted(CarService.CarParameter.NUMBER_OF_MANUFACTURERS,false));

    }
}
