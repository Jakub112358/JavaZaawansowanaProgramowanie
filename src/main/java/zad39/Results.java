package zad39;

import java.util.concurrent.atomic.AtomicInteger;

//Zadanie 39.
//
//Napisz program, który ma za zadanie rozwiązać poniższy problem.
//Istnieje system przechowujący aktualne wyniki w zawodach.
// Wiele ekranów odczytuje aktualne wyniki, natomiast kilka czujników aktualizuje te wyniki.
//Napisz program, który pozwala na nieprzerwany odczyt danych przez wiele ekranów (wątków)
// oraz aktualizację danych przez wiele czujników (wątków).
//Aby zaktualizować wyniki, czujnik musi przekazać aktualne wyniki wraz z nowymi.
// System następnie weryfikuje czy czujnik miał aktualne dane i aktualizuje dane.
// Jeżeli w tym czasie dane w systemie zmieniły się, aktualizacja danych przez czujnik jest odrzucona.
//Dla ułatwienia możesz przyjąć, że czujnik odczytuje dane, czeka losową ilość czasu i zwiększa dane o losową wartość.
public class Results {
    private static int currentResult = 0;

    public static int getCurrentResult() {
        return currentResult;
    }

    public static void setCurrentResult(int lastResult, int newResult) {
        if (currentResult==lastResult){
            Results.currentResult = newResult;
            System.out.println("SENSOR: result updated to: "+currentResult);
        }else{
            System.out.println("SENSOR: oups, results don't match");
        }

    }
}
