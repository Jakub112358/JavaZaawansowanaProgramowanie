package zad18;

import zad19.Laptop;

public class ComputerTest {


    public static void main(String[] args) {
        Computer computer1 = new Computer("intel i7",2048,"Radeon something","lenovo","W530");
        Computer computer2 = new Computer("intel i7",2048,"Radeon something","lenovo","W530");
        Computer computer3 = new Computer("intel i7",1024,"Radeon something","lenovo","W530");
        Laptop laptop1 = new Laptop("intel i7",2048,"Radeon something","lenovo","W530","some battery");
        Laptop laptop2 = new Laptop("intel i7",2048,"Radeon something","lenovo","W530","other battery");
        Laptop laptop3 = new Laptop("intel i7",2048,"Radeon something","lenovo","W530","other battery");
        System.out.println(computer1.equals(computer2));
        System.out.println(computer1 == computer2);
        computer3.setGpu("other graphic card");
        System.out.println(computer3.getRam());
        System.out.println(computer3);
        System.out.println();
        System.out.println(laptop1.equals(computer1));
        System.out.println(laptop1.equals(laptop3));
        System.out.println(laptop2.equals(laptop3));
        System.out.println(laptop1);
    }
}
