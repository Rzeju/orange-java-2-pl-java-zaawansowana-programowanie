package pl.sda.zad15;

public enum Car {

    FERRARI(350, 1_000_000d),
    PORSCHE(300, 500_000d),
    BMW(280, 350_000d),
    OPEL(220, 170_000d),
    FIAT(180, 90_000),
    TOYOTA(200, 120_000);

    private Integer power;
    private double price;

    Car(int power, double price) {
        this.power = power;
        this.price = price;
    }

    public boolean isRegular() {
        return price < 250_000d;
    }

    public boolean isPremium() {
        return !isRegular();
    }

    public boolean isFasterThan(Car car) {
        int compareResult = this.power.compareTo(car.power);
        return compareResult > 0;
    }
}
