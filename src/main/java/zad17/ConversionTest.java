package zad17;

public class ConversionTest {
    public static void main(String[] args) {
        System.out.println(MeasurmentConverter.convert(10, ConversionType.INCHES_TO_CENTIMETERS));
        System.out.println(MeasurmentConverter.convert(10, ConversionType.METERS_TO_YARDS));
        System.out.println(MeasurmentConverter.convert(10, ConversionType.KILOMETERS_TO_MILES));
    }
}
