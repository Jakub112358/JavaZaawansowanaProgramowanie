package zad7;

public class MagazineTest {


    public static void main(String[] args) {
        Magazine magazine = new Magazine(3);
        System.out.println(magazine.isLoaded());
        magazine.loadBullet("ala");
        magazine.loadBullet("ma");
        magazine.loadBullet("kota");
        magazine.loadBullet("uhuhu");
        System.out.println(magazine.isLoaded());
        magazine.shot();
        magazine.shot();
        magazine.shot();
        magazine.shot();
    }
}
