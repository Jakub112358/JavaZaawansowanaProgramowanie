package zad12;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Car {
    public enum EngineType {
        S3,
        S4,
        S6,
        V6,
        V8,
        V12
    }

    private String name;
    private String model;
    private BigDecimal price;
    private LocalDate dateOfProduction;
    private List<Manufacturer> producers;
    private EngineType engineType;

    public Car(CarBuilder carBuilder) {
        this.name = carBuilder.getName();
        this.model = carBuilder.getModel();
        this.price = carBuilder.getPrice();
        this.dateOfProduction = carBuilder.getDateOfProduction();
        this.producers = carBuilder.getProducers();
        this.engineType = carBuilder.getEngineType();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(LocalDate dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public List<Manufacturer> getProducers() {
        return producers;
    }

    public void setProducers(List<Manufacturer> producers) {
        this.producers = producers;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(price, car.price) && Objects.equals(dateOfProduction, car.dateOfProduction) && Objects.equals(producers, car.producers) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, dateOfProduction, producers, engineType);
    }

    @Override
    public String toString() {
        return "name= " + name + ", model= " + model;
    }
}
