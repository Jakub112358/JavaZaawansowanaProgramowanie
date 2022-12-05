package zad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Stwórz metodę, która jako parametr przyjmuje listę stringów,
// następnie zwraca tą listę posortowaną alfabetycznie od Z do A nie biorąc pod uwagę wielkości liter.
public class Task2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("Z");
        stringList.add("B");
        stringList.add("C");
        stringList.add("y");

        System.out.println(sortListWithoutCase(stringList));

    }

    private static List<String> sortListWithoutCase(List<String> list) {
        //task 2
        list.sort(Comparator.comparing(String::toLowerCase));
        Collections.reverse(list);
        return list;
    }
}
