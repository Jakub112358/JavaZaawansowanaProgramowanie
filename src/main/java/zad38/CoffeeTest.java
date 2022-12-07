package zad38;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CoffeeTest {
    public static void main(String[] args) {
        Timer timer = new Timer();

        CoffeeMakerThread coffeeMaker1 = new CoffeeMakerThread("maker 1");
        CoffeeMakerThread coffeeMaker2 = new CoffeeMakerThread("maker 2");
        coffeeMaker1.start();
        coffeeMaker2.start();


        ScheduledExecutorService coffeeAdderService = Executors.newSingleThreadScheduledExecutor();
        coffeeAdderService.scheduleAtFixedRate(new WaterAdderRunnable(), 0, 1, TimeUnit.SECONDS);


        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Koniec imprezy!");
                coffeeAdderService.shutdown();
                coffeeMaker1.close();
                coffeeMaker2.close();

            }
        }, 3000);



    }
}
