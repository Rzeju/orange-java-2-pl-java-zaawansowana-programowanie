package pl.sda.zad20;

public class Cone extends Shape3D {

    private double r;
    private double h;
    private double l;

    public Cone(double r, double h, double l) {
        this.r = r;
        this.h = h;
        this.l = l;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * r + 2 * l;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(r, 2) + Math.PI * r * l;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(r, 2) * h / 3 ;
    }
}
