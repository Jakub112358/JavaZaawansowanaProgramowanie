package zad17;
//Stwórz klasę enum ConversionType ze stałymi METERS_TO_YARDS, YARDS_TO_METERS, CENTIMETERS_TO_ICHES,
// INCHES_TO_CENTIMETERS, KILOMETERS_TO_MILES, MILES_TO_KILOMETERS.
//Enum powinien posiadać parametr typu Converter służący do przeprowadzania obliczeń dla danego typu.
//Następnie stwórz klasę MeasurementConverter,
// która będzie posiadała metodę convert(int value, ConvertionType conversionType) i na podstawie przekazanej wartości oraz typu konwersji,
// korzystała z Convertera danego typu i zwracała wynik.
public enum ConversionType {
    METERS_TO_YARDS(new Converter(1.0936133)),
    YARDS_TO_METERS(new Converter(0.9144)),
    CENTIMETERS_TO_INCHES(new Converter(0.393700787)),
    INCHES_TO_CENTIMETERS(new Converter(2.54)),
    KILOMETERS_TO_MILES(new Converter(0.621371192)),
    MILES_TO_KILOMETERS(new Converter(1.609344));

    public final Converter converter;

    ConversionType(Converter converter) {
        this.converter = converter;
    }


    public static class Converter{
        private final double conversionRate;

        public Converter(double conversionRate) {
            this.conversionRate = conversionRate;
        }

        public double getConversionRate() {
            return conversionRate;
        }
    }


}
