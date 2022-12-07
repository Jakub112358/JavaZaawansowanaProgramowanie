package zad39;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class SensorThread extends Thread{
    private final Random random = new Random();

    @Override
    public void run() {
        for(int i=0; i<20; i++){

            int lastResult = Results.getCurrentResult();
            try {
                sleep(random.nextInt(3000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Results.setCurrentResult(lastResult, random.nextInt(100));
        }
    }
}
