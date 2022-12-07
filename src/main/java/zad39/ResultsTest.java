package zad39;

import java.util.Timer;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ResultsTest {
    public static void main(String[] args) {
        Timer timer = new Timer();


        Executor executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i <10; i++) {
            executor.execute(new DisplayerThread(String.valueOf(i)));
        }

        Thread sensorThread1 = new Thread(new SensorThread());
        Thread sensorThread2 = new Thread(new SensorThread());
        sensorThread1.start();
        sensorThread2.start();

    }
}
