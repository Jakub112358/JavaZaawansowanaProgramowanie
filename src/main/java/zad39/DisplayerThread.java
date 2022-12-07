package zad39;

public class DisplayerThread extends Thread{
    public DisplayerThread(String name) {
        super(name);
    }

    @Override
    public void run() {
for(int i=0;i<10;i++){
    try {
        sleep(100);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    System.out.println(Results.getCurrentResult());

}
    }
}
