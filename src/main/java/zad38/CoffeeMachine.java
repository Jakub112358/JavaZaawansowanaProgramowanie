package zad38;

import java.util.Random;

public class CoffeeMachine {
    public static int water = 0;
    public static int coffeesDone = 0;
    public static final Object lock = new Object();
    private final Random random = new Random();

    public void addWater() {

        synchronized (lock) {
            while (water > 2000) {
                System.out.println("too much water in the tank");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            water += 1000;
            System.out.println("water added: " + water);
            lock.notifyAll();
        }
    }

    public void makeCoffee(String coffeeMakerName) {
        try {
            Thread.sleep(random.nextInt(1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (lock) {
            while (water < 200) {
                try {
                    System.out.println(coffeeMakerName + " not enough water in the tank :/");
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            water -= 200;
            System.out.println(coffeeMakerName + " made coffee number " + ++coffeesDone + ", water rest: " + water);
            if (water <= 2000)
                lock.notifyAll();
        }
    }
}
