package zad6;

import java.util.TreeMap;

//Zadanie 6.
//
//Stwórz metodę, która przyjmuje TreeMap i wypisuje w konsoli pierwszy i ostatni EntrySet.
public class Task6 {
    public static void main(String[] args) {
        TreeMap<Integer, String> integerTreeMap = new TreeMap<>();
        integerTreeMap.put(2,"A");
        integerTreeMap.put(3,"B");
        integerTreeMap.put(4,"C");
        displayEdgeEntrySets(integerTreeMap);

    }

    public static <K, V> void displayEdgeEntrySets(TreeMap<K,V> treeMap){
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());
    }
}
