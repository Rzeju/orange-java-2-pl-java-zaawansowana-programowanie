package pl.sda.zad20;

public class Qube extends Shape3D {

    private double a;

    public Qube(double a) {
        this.a = a;
    }

    @Override
    public double calculatePerimeter() {
        return 12 * a;
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(a, 2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(a, 3);
    }
}
