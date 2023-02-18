package pl.sda.zad20;

public class Main {

    public static void main(String[] args) {

        System.out.println("Rectangle");
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());

        System.out.println("Triangle");
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.calculatePerimeter());
        System.out.println(triangle.calculateArea());

        System.out.println("Hexagon");
        Hexagon hexagon = new Hexagon(5);
        System.out.println(hexagon.calculatePerimeter());
        System.out.println(hexagon.calculateArea());


        //TRÓJKĄT DLA NIEPOPRAWNYCH DANYCH
        //OBIEKT ZOSTANIE UTWORZONY NATOMIAST JEGO BOKI BEDE MIAL WARTOŚCI DOMYŚLNE
        System.out.println("Bad Triangle");
        Triangle badTriangle = new Triangle(1, 2, 10);
        System.out.println(badTriangle);
        System.out.println(badTriangle.calculatePerimeter());
        System.out.println(badTriangle.calculatePerimeter());
    }
}
