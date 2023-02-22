package pl.bonus.zad18_zad19_prezentacja;

import java.util.Objects;

public class Laptop extends Computer {

    private int batteryLevel;

    public Laptop(String processor, String ram, String graphicCard, String producer, String model, int batteryLevel) {
        super(processor, ram, graphicCard, producer, model);
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return batteryLevel == laptop.batteryLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryLevel);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryLevel=" + batteryLevel +
                "} " + super.toString();
    }
}
