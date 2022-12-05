package zad18;
//Zadanie 18.
//
//Stwórz klasę Computer posiadającą pola określające cechy komputera: procesor, ram, karta grafiki, firma oraz model.
// Zaimplementuj settery, gettery, konstruktor z wszystkimi polami, metody toString() oraz equals() i hashcode().
//Zainstancjuj kilka obiektów i sprawdź działanie metod.
import java.util.Objects;

public class Computer {
    private String processor;
    private int ram;
    private String gpu;
    private String producer;
    private String model;

    public Computer(String processor, int ram, String gpu, String producer, String model) {
        this.processor = processor;
        this.ram = ram;
        this.gpu = gpu;
        this.producer = producer;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", gpu='" + gpu + '\'' +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram && Objects.equals(processor, computer.processor) && Objects.equals(gpu, computer.gpu) && Objects.equals(producer, computer.producer) && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, gpu, producer, model);
    }
}
