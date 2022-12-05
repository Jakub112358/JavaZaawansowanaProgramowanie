package zad5;

import java.util.HashSet;

public class HashSetTest {


    public static void main(String[] args) {
        SDAHashSet <String> sdaHashSet = new SDAHashSet<>();
        sdaHashSet.add("ala");
        sdaHashSet.add("ma");

        System.out.println(sdaHashSet.add("kota"));

        System.out.println(sdaHashSet.size());
        System.out.println(sdaHashSet.remove("non existing element"));
        System.out.println(sdaHashSet.remove("ala"));

        System.out.println(sdaHashSet.contains("ala"));
        System.out.println(sdaHashSet.contains("ma"));
        sdaHashSet.clear();
        System.out.println(sdaHashSet.size());


    }
}
