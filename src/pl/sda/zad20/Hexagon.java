package pl.sda.zad20;

public class Hexagon extends Shape {

    private double a;

    public Hexagon(double a) {
        this.a = a;
    }

    @Override
    public double calculatePerimeter() {
        return 6 * a;
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(a, 2) * Math.sqrt(3) / 4;
    }
}
