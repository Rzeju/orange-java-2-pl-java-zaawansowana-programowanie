package pl.sda.zad17;

public class YardsToMetersConverter implements Converter {
    @Override
    public double convert(int value) {
        return value * 0.9144d;
    }
}
