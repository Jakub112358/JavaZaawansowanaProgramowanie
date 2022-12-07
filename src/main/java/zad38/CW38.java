package zad38;
//Zadanie 38.
//
//Napisz aplikację, która będzie symulować maszynę do robienia kawy.
//W przypadku, gdy dowolna cykliczna usługa parzenia kawy zastanie pusty zbiornik na wodę, powinno nastąpić wstrzymanie wątku.
//W momencie, gdy w maszynie zostanie uzupełniona woda, powinno nastąpić wzbudzenie wątku.

import java.util.Locale;
import java.util.Random;

public class CW38 {
    private static Double water = 1.0;
    private final static Object lock = new Object();

    public static void main(String[] args) {
        Random random = new Random();
        //wyrazenie lambda jest to tak naprawde instancja klasy, ktora implementuja konkretny interfejs
        //oczywisice implementujac dana metode abstrakcyjna z tego interfejsu
        //w tym przypadku tym interfejsem jest Runnable
        Thread waterRefiller = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(random.nextInt(100));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock) {
                    while (water > 2.0) {
                        System.out.println("too much water in the tank");
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    water += 1.0;
                    System.out.println("water added: " + String.format(Locale.ENGLISH, "%.1f", water));
                    lock.notify(); //metoda informuje wątek który został dodany do kolejki oczekujacych na powiadomienie
//                    lock.notifyAll(); //wzbudzi WSZYSTKIE watki oczekujace na danym obiekcie
                }
            }
        });
        Thread coffeeMaker1 = new Thread(() -> {
            for (int i = 0; i < 25; i++) {
                try {
                    Thread.sleep(random.nextInt(200));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock) {
                    while (water < 0.2) { //zamiast ifa stosujemy while, bo moga wystepowac falszywe/sztuczne wybudzenia
                        System.out.println("water tank is empty!");
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    water -= 0.2;
                    if (water <= 2.0)
                        lock.notify();
                    System.out.println("[Service1] Black coffee" + (i + 1) + " is ready! " + String.format(Locale.ENGLISH, "%.1f", water));

                }

            }
        });

        Thread coffeeMaker2 = new Thread(() -> {
            for (int i = 0; i < 25; i++) {
                try {
                    Thread.sleep(random.nextInt(400));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock) {
                    while (water < 0.2) {
                        System.out.println("water tank is empty!");
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    water -= 0.2;
                    if (water <= 2.0)
                        lock.notify();
                    System.out.println("[Service2] Black coffee" + (i + 1) + " is ready! " + String.format(Locale.ENGLISH, "%.1f", water));

                }

            }
        });


        coffeeMaker1.start();
        waterRefiller.start();
        coffeeMaker2.start();
    }
}
