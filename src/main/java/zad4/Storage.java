package zad4;

import java.util.*;
import java.util.stream.Stream;

//Zadanie 4.
//
//Stwórz klasę Storage, która będzie miała prywatne pole typu Map, publiczny konstruktor oraz metody:
//addToStorage(String key, String value) → dodawanie elementów do przechowywalni
//printValues(String key) → wyświetlanie wszystkich elementów pod danym kluczem
//findValues(String value) → wyświetlanie wszystkich kluczy, które mają podaną wartość
//
//Klasa Storage powinna pozwalać na przechowywanie wielu wartości pod jednym kluczem.
public class Storage {
    private Map<String, List<String>> stringListMap = new HashMap<>();

    public Storage() {
    }

    public void addToStorage(String key, String value) {
        List<String> stringList = new ArrayList<>();
        if (stringListMap.containsKey(key))
            stringList = stringListMap.get(key);

        stringList.add(value);
        stringListMap.put(key, stringList);
    }

    public void printValues(String key) {
        if (stringListMap.containsKey(key)) {
            System.out.println(stringListMap.get(key));
        } else System.out.println("key: " + key + " not found");
    }

    public void findValues(String value) {
        boolean found = false;
        for (Map.Entry<String, List<String>> entry : stringListMap.entrySet()) {
            if (entry.getValue().contains(value)) {
                System.out.println("value " + value + " found for key: " + entry.getKey());
                found = true;
            }
        }
        if(!found) System.out.println("value: " + value + " not found");
    }

}
