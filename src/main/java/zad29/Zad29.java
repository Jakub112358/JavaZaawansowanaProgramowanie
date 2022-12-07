package zad29;
//Zaimplementuj generyczną metodę partOf,
// która na podstawie tablicy dowolnego typu oraz wskazanej funkcji
// jako parametrów zwróci % elementów spełniających warunek.

import java.util.Arrays;
import java.util.function.Predicate;

public class Zad29 {
    public static void main(String[] args) {

        Integer[] integerArray = new Integer[20];
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = i;
        }

        Predicate<Integer> predicate = i -> (i % 3 == 0 || i % 5 == 0);

        System.out.println(partOf(integerArray, predicate));

    }

    public static <T> double partOf(T[] array, Predicate<T> predicate) {
        int counter = 0;
        for (T t : array) {
            if (predicate.test(t)) {
                counter++;
            }
        }
        return 100.0 * counter / array.length;
    }
}
