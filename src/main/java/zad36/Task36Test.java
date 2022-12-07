package zad36;
//Utwórz klasę, która ma dwa prywatne statyczne pola typu Thread (wątek)
// oraz standardową metodę public static void main(String[] args).
//Następnie zainicjuj pola typu Thread używając konstruktora przyjmującego obiekt Runnable
// i przekaż ThreadPlaygroundRunnable tworząc go za pomocą konstruktora, za każdym razem podając inną nazwę.
//Na każdym z wątków (Thread) użyj metody start().

public class Task36Test {
    private static Thread thread1;
    private static Thread thread2;

    public static void main(String[] args) {
        thread1 = new Thread(new ThreadPlaygroundRunnable("A"));
        thread2 = new Thread(new ThreadPlaygroundRunnable("B"));

        thread1.start();
        thread2.start();
    }
}
