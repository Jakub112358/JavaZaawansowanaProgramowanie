package zad12;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class CarBuilder {
    private String name;
    private String model;
    private BigDecimal price;
    private LocalDate dateOfProduction;
    private List<Manufacturer> producers;
    private Car.EngineType engineType;

    public static CarBuilder newCar() {
        return new CarBuilder();
    }
    public CarBuilder withName(String name){
        this.name = name;
        return this;
    }
    public CarBuilder withModel (String model){
        this.model=model;
        return this;
    }
    public CarBuilder withPrice(BigDecimal price){
        this.price=price;
        return this;
    }
    public CarBuilder withDateOfProduction(LocalDate dateOfProduction){
        this.dateOfProduction = dateOfProduction;
        return this;
    }
    public CarBuilder withProducers(List<Manufacturer> producers){
        this.producers = producers;
        return this;
    }
    public CarBuilder withEngineType(Car.EngineType engineType){
        this.engineType = engineType;
        return this;
    }

    public Car toCar(){
        return new Car(this);
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public LocalDate getDateOfProduction() {
        return dateOfProduction;
    }

    public List<Manufacturer> getProducers() {
        return producers;
    }

    public Car.EngineType getEngineType() {
        return engineType;
    }
}
