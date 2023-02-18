package pl.sda.zad15;

public class Main {

    public static void main(String[] args) {
        System.out.println("Is Regular/Is Premiun");
        System.out.println("BMW");
        System.out.println(Car.BMW.isRegular());
        System.out.println(Car.BMW.isPremium());

        System.out.println("FIAT");
        System.out.println(Car.FIAT.isRegular());
        System.out.println(Car.FIAT.isPremium());

        System.out.println("Is faster than");

        System.out.println("Ferrari -> Fiat");
        System.out.println(Car.FERRARI.isFasterThan(Car.FIAT));

        System.out.println("Fiat -> Ferrari");
        System.out.println(Car.FIAT.isFasterThan(Car.FERRARI));

        System.out.println("BMW -> OPEL");
        System.out.println(Car.BMW.isFasterThan(Car.OPEL));

        System.out.println("OPEL -> BMW");
        System.out.println(Car.OPEL.isFasterThan(Car.BMW));
    }
}
