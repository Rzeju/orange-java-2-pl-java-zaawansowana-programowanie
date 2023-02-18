package pl.sda.zad17;

public class MeasurementConverter {

    public double convert(int value, ConversionType conversionType) {
        return conversionType.convert(value);
    }
}
