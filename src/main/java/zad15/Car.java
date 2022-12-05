package zad15;

import java.math.BigDecimal;

public enum Car implements Comparable<Car> {
    FERRARI(1_000_000,780,320,true),
    PORSCHE(700_000,510,300,true),
    MERCEDES(500_000,435,250,true),
    BMW(650_000,600,250,true),
    OPEL(120_000,150,220,false),
    FIAT(80_000,105,200,false),
    TOYOTA(150_000,170,200,false);

    public int price;
    public int power;
    public int maxSpeed;
    public final boolean premium;

    Car(int price, int power, int maxSpeed,boolean premium) {
        this.price = price;
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }
    public boolean isRegular(){
        return !isPremium();
    }
    public boolean isFasterThan (Car car){
        return this.compareTo(car)<0;
    }


}
