package zad14;

import java.util.*;
import java.util.stream.Collectors;

//Zadanie 14.
//
//Na podstawie 100_000 elementowej tablicy z losowo wybranymi wartościami zaimplementuj następujące funkcjonalności:
//
//    zwróć listę unikalnych elementów,
//    zwróć listę elementów, które co najmniej raz powtórzyły się w wygenerowanej tablicy,
//    zwróć listę 25 najczęściej powtarzających się elementów.
//
//Zaimplementuj metodę, która deduplikuje elementy w liście.
// W przypadku znalezienia duplikatu, zastępuje go nową losową wcześniej nie występującą wartością.
// Sprawdź czy metoda zadziałała poprawnie wywołując metodę numer 2.
public class Task14 {
    public static void main(String[] args) {
//        int arraySize = 10;
        int arraySize = 100_000;
//        int randomBound = 10;
        int randomBound = 150_000;
        Integer[] integers = new Integer[arraySize];
        Random random = new Random();

        for (int i = 0; i < integers.length; i++) {
            integers[i] = random.nextInt(randomBound);
        }

        List<Integer> testList = List.of(integers);

        System.out.println("all elements number: " + integers.length);
//        System.out.println("all elements: " + testList);
        System.out.println("unique elements number: " + getUniqueElementsAsList(integers).size());
//        System.out.println("unique elements: " + getUniqueElementsAsList(integers));
        System.out.println("duplicated elements number: " + getDuplicatedElementsAsList(integers).size());
//        System.out.println("duplicated elements: " + getDuplicatedElementsAsList(integers));
        System.out.println("most frequent elements: " + getMostFrequentElements(integers, 25));
//        System.out.println("most frequent elements: " + getMostFrequentElements(integers, 3));

        List <Integer> deduplicatedList = deduplicate(testList, randomBound);
//        System.out.println(deduplicatedList);

        if (deduplicatedList != null) {
            System.out.println(deduplicatedList.size());
            System.out.println("duplicated elements after deduplication: " + getDuplicatedElementsAsList(deduplicatedList.toArray(new Integer[0])));
        }


    }

    public static List<Integer> getUniqueElementsAsList(Integer[] integers) {
        return new LinkedList<>(new HashSet<>(Arrays.asList(integers)));
    }

    public static List<Integer> getDuplicatedElementsAsList(Integer[] inputIntegersArray) {
        Map<Integer, Integer> integerMap = convertToMap(inputIntegersArray);

        return integerMap.entrySet().stream()
                .filter(s -> s.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static List<Integer> getMostFrequentElements(Integer[] integers, int numberOfElements) {

        Map<Integer, Integer> integerMap = new HashMap<>(convertToMap(integers));

        return integerMap.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue() - e1.getValue())
                .map(Map.Entry::getKey)
                .limit(numberOfElements)
                .collect(Collectors.toList());

    }


    public static Map<Integer, Integer> convertToMap(Integer[] integers) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (Integer integer : integers) {
            Integer counter = integerMap.get(integer);
            if (counter == null) {
                integerMap.put(integer, 1);
            } else
                integerMap.put(integer, ++counter);
        }
        return integerMap;
    }

    public static List<Integer> deduplicate(List<Integer> inputList, int randomBound) {
        Random random = new Random();
        if (randomBound < inputList.size()) {
            System.out.println("random bound must be bigger than size of an input list");
            return null;
        }

        List<Integer> uniqueElementsList = new ArrayList<>(new HashSet<>(inputList));

        while (uniqueElementsList.size() < inputList.size()) {
            int randomNumber = random.nextInt(randomBound);
            if (!uniqueElementsList.contains(randomNumber)) {
                uniqueElementsList.add(randomNumber);
            }
        }
        return uniqueElementsList;
    }
}
