package zad27;

public class JoinerTest {
    public static void main(String[] args) {
        Joiner joiner = new Joiner("-");
        System.out.println(joiner.join(1,2,3,4));
        System.out.println(joiner.joinV2(1,2,3,4));
    }


}
