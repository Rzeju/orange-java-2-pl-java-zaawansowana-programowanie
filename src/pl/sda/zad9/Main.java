package pl.sda.zad9;

public class Main {

    public static void main(String[] args) {

        Point2D center = new Point2D(1, 1);
        Point2D point = new Point2D(3, 2);

        Circle circle = new Circle(center, point);

        System.out.println("Pierwotny obiekt Circle");
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

        MoveDirection moveDirection = new MoveDirection(2, 5);
        circle.move(moveDirection);

        System.out.println("Obiekt Circle po metodzie movie()");
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println(circle);
    }
}
