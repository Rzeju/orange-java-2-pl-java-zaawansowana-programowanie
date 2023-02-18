package pl.sda.zad17;

public class MetersToYardsConverter implements Converter {

    @Override
    public double convert(int value) {
        return value * 1.0936133d;
    }
}
