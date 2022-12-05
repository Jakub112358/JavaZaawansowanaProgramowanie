package zad3;

import java.util.HashMap;
import java.util.Map;

//Zadanie 3.
//Stwórz metodę, która jako parametr przyjmuje mapę, gdzie kluczem jest string, a wartością liczba,
// a następnie wypisuje każdy element mapy do konsoli w formacie: Klucz: "", Wartość: "".
// Na końcu każdego wiersza poza ostatnim, powinien być przecinek, a w ostatnim kropka.
//Przykład:
//Klucz: Java, Wartość: 18,
//Klucz: Python, Wartość: 1,
//…
//Klucz: PHP, Wartość: 0.
public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> languageMap = new HashMap<>();
        languageMap.put("Java", 18);
        languageMap.put("Python", 1);
        languageMap.put("C++", 10);
        languageMap.put("PHP", 0);

        showKeysAndValues(languageMap);

    }

    public static void showKeysAndValues (Map<String, Integer> map) {
        int count = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            if (count == map.size()-1) {
                System.out.println("Klucz: " + key + ", Wartość: " + value + ".");
                break;
            }
            System.out.println("Klucz: " + key + ", Wartość: " + value + ",");
            count++;
        }
    }

}
