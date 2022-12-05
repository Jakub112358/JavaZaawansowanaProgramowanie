package zad7;

import java.util.ArrayList;
import java.util.List;

//Zadanie 7.
//
//Stwórz klasę imitującą magazynek do broni.
// Klasa powinna mieć możliwość definiowania rozmiaru magazynka za pomocą konstruktora.
// Zaimplementuj metody:
//loadBullet(String bullet) → dodawanie naboju do magazynka, nie pozwala załadować więcej naboi niż wynosi pojemność magazynka
//isLoaded() → zwraca informację o tym czy broń jest naładowana (przynajmniej jeden nabój) czy nie
//shot() → jedno wywołanie wystrzeliwuje (wypisuje w konsoli wartość string) jeden - ostatni załadowany
// nabój i przygotowuje kolejny, załadowany przed ostatnim,
// jeżeli nie ma więcej nabojów to wypisuje w konsoli “pusty magazynek”
public class Magazine {
    private final int magazineSize;
    private List<String> magazine;

    public Magazine(int magazineSize) {
        this.magazineSize = magazineSize;
        magazine = new ArrayList<>();

    }

    public void loadBullet(String bullet) {
        if (magazine.size() < magazineSize) {
            magazine.add(bullet);
        } else System.out.println("magazine is full");
    }

    public boolean isLoaded() {
        return !magazine.isEmpty();
    }

    public void shot() {
        if (magazine.isEmpty()) {
            System.out.println("magazine is empty");
        } else {
            System.out.println(magazine.remove(magazine.size() - 1));
        }
    }
}
