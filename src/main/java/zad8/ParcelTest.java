package zad8;
//Zadanie 8.
//
//Zaimplementuj interfejs Validator, który będzie zawierać w swojej deklaracji metodę boolean validate(Parcel input).
// Stwórz klasę Parcel z parametrami:
//• int xLength
//• int yLength
//• int zLength
//• float weight
//• boolean isExpress
//Validator powinien weryfikować czy suma wymiarów (x, y, z) nie przekracza 300,
// czy każdy z rozmiarów nie jest mniejszy niż 30,
// czy waga nie przekracza 30.0 dla isExpress=false lub 15.0 dla isExpress=true.
// W przypadku błędów, powinien o nich poinformować użytkownika.
public class ParcelTest {
    public static void main(String[] args) {

        System.out.println("should be true: ");
        System.out.println(Validator.validate(new Parcel(100, 100, 100, 10, false)));
        System.out.println(Validator.validate(new Parcel(1, 1, 30, 10, false)));
        System.out.println(Validator.validate(new Parcel(100, 100, 100, 20, false)));

        System.out.println("should be false: ");
        System.out.println(Validator.validate(new Parcel(100, 100, 101, 10, false)));
        System.out.println(Validator.validate(new Parcel(29, 29, 29, 10, false)));
        System.out.println(Validator.validate(new Parcel(100, 100, 100, 31, false)));
        System.out.println(Validator.validate(new Parcel(100, 100, 100, 16, true)));
    }
}
