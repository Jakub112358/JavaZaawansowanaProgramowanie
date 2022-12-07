package zad37;
//Zadanie 37.
//
//Stwórz klasę zawierającą standardową metodę statyczną main oraz zmienną typu Executor
// i korzystając z metody fabrykującej newFixedThreadPool klasy Executors utwórz pulę executorów o rozmiarze 2.
//W iteracji dodaj do Executora 10 obiektów klasy ThreadPlaygroundRunnable z poprzedniego zadania.
// Jako nazwy użyj dowolnego ciągu znaków oraz numeru aktualnej iteracji.

import zad36.ThreadPlaygroundRunnable;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Task37 {
    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(2);
        for (int i =0; i<10; i++){
            executor.execute(new ThreadPlaygroundRunnable("TPR: " + i));
        }

    }
}
