package pl.sda.zad17;

public class Main {

    public static void main(String[] args) {
        MeasurementConverter measurementConverter = new MeasurementConverter();

        double metersToYard = measurementConverter.convert(100, ConversionType.METERS_TO_YARDS);
        System.out.println(metersToYard);

        double kilometersToMiles = measurementConverter.convert(1000, ConversionType.KILOMETERS_TO_MILES);
        System.out.println(kilometersToMiles);

    }
}
