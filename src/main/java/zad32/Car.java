package zad32;

import java.io.Serializable;

public class Car implements Serializable {
    String name;
    int hp;

    public Car(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
