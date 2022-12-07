package zad38;

public class WaterAdderRunnable implements Runnable {
    @Override
    public void run() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
            coffeeMachine.addWater();

    }
}
