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
public interface Validator {
    static boolean validate(Parcel input) {
        if (input.getxLength() + input.getyLength() + input.getzLength() > 300) {
            System.out.println("sum of dimensions is too big");
            return false;
        } else if (input.getxLength() < 30 && input.getyLength() < 30 && input.getzLength() < 30) {
            System.out.println("all dimensions are smaller than 30");
            return false;
        } else if (input.getWeight() > 30 && !input.isExpress()) {
            System.out.println("weight is bigger than 30 for non-express parcel");
            return false;
        } else if (input.getWeight() > 15 && input.isExpress()) {
            System.out.println("weight is bigger than 15 for express parcel");
            return false;
        }
        return true;

    }
}
