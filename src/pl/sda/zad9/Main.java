package pl.sda.zad9;

public class Main {

    public static void main(String[] args) {

        Point2D center = new Point2D(1, 1);
        Point2D point = new Point2D(3, 2);

        Circle circle = new Circle(center, point);

        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
    }
}
