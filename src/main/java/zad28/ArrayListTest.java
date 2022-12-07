package zad28;

public class ArrayListTest {
    public static void main(String[] args) {


        ExtendedArrayList<Integer> integersList = new ExtendedArrayList<>();
        for (int i = 0; i < 10; i++) {
            integersList.add(i);
        }

        ExtendedArrayList<String> stringList = new ExtendedArrayList<>();
        for (int i = 0; i < 10; i++) {
            stringList.add(String.valueOf(i));
        }

        System.out.println(integersList);
        System.out.println(stringList);
        System.out.println(integersList.getEveryNthElement(12, 1));
        System.out.println(stringList.getEveryNthElement(2, 1));
    }
}
