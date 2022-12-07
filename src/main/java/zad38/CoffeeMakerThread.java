package zad38;

public class CoffeeMakerThread extends Thread {
    private boolean closed = false;

    public CoffeeMakerThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
//        for(int i=0;i<2;i++){
        while(!closed){
            coffeeMachine.makeCoffee(getName());
        }
    }
    public void close (){
        this.closed = true;
    }
}
