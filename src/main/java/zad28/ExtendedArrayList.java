package zad28;
//Zadanie 28.
//
//Rozszerz klasę ArrayList implementując metodę getEveryNthElement().
// Metoda ta zwraca listę elementów oraz przyjmuje dwa parametry:
// indeks elementu od którego zaczyna oraz liczbę określającą co który element ma wybierać.
//Dla listy: [a, b, c, d, e, f, g] oraz parametrów: startIndex=2 i skip=3 zwróci listę [c, g]

import java.util.ArrayList;
import java.util.List;

public class ExtendedArrayList<T> extends ArrayList<T> {
    public List<T> getEveryNthElement(int startIndex, int skip) {
        List<T> resultList = new ArrayList<>();
        for (int i = startIndex; i < this.size(); i += skip + 1) {
            resultList.add(this.get(i));
        }
        return resultList;
    }
}
