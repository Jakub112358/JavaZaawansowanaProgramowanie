package zad27;

import java.util.Arrays;
import java.util.stream.Collectors;

//Zadanie 27.
//
//Zaprojektuj klasę Joiner, która w konstruktorze będzie przyjmowała separator (string)
// oraz posiadała metodę join() pozwalającą na podanie dowolnej ilości obiektów typu T.
// Metoda ta będzie zwracać stringa łącząc wszystkie przekazane elementy wywołując ich metodę toString() i oddzielać je separatorem.
//np. dla Integerów oraz separatora “-” będzie zwracała: 1-2-3-4…
public class Joiner {
    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public <T> String join(T... elements) {
        String result = "";
        int counter = 0;

        for (T element : elements) {
            if (counter < elements.length - 1) {
                result += element.toString() + separator;
                counter++;
            } else {
                result += element.toString();
            }
        }
        return result;
    }

    public <T> String joinV2 (T... elements){
        return Arrays.stream(elements)
                .map(e -> e.toString())
                .collect(Collectors.joining(separator));
    }
}
