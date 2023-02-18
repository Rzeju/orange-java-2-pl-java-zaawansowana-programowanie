package pl.sda.zad17;

public enum ConversionType {

    METERS_TO_YARDS(new MetersToYardsConverter()),
    YARDS_TO_METERS(new YardsToMetersConverter()),
    CENTIMETERS_TO_INCHES(value -> value * 0.393700787d),
    INCHES_TO_CENTIMETERS(value -> value * 2.54d),
    KILOMETERS_TO_MILES(value -> value * 0.621371192),
    MILES_TO_KILOMETERS(value -> value * 1.609344);

    private Converter converter;

    ConversionType(Converter converter) {
        this.converter = converter;
    }

    public double convert(int value) {
        return converter.convert(value);
    }
}
