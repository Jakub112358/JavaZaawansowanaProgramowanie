package zad1;

import java.util.*;

//Stwórz metodę, która jako parametr przyjmuje listę stringów, następnie zwraca tą listę posortowaną alfabetycznie od Z do A.
public class Task1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("Z");
        stringList.add("B");
        stringList.add("C");

        System.out.println(sortStringList(stringList));

    }

    public static List<String> sortStringList(List<String> inputList){
        return inputList.stream().sorted(Comparator.reverseOrder()).toList();
    }
}
