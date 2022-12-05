package zad22;
//Stwórz interfejs Fillable posiadający metodę fill(). Zaimplementuj metodę w klasie 3DShape z poprzedniego zadania lub osobno w klasach Cone oraz Qube.
//Metoda fill() powinna przyjmować parametr np. int i sprawdzać, czy po, akcja napełnienia figury:
//• wleje za dużo wody do figury i przeleje,
//• napełni figurę wodą po brzegi,
//• wleje za mało wody.
//Dla każdej sytuacji powinna zapisać informację o stanie w konsoli. Użyj metody calculateVolume().

//tests in zad20: ShapeTest
public interface Fillable {
     void fill(double waterVolume);
}
