package zad15;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = Car.BMW;
        Car car2 = Car.FERRARI;
        Car car3 = Car.FIAT;

        System.out.println(car3.isPremium());
        System.out.println(car3.isRegular());
        System.out.println();
        System.out.println(car2.isFasterThan(car1));
        System.out.println(car1.isFasterThan(car3));
        System.out.println(car1.isFasterThan(car1));
    }
}
