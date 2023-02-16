package pl.sda.zad12;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Manufacturer> manufacturerList1 = new ArrayList<>();
        List<Manufacturer> manufacturerList2 = new ArrayList<>();
        List<Manufacturer> manufacturerList3 = new ArrayList<>();
        List<Manufacturer> manufacturerList4 = new ArrayList<>();

        Manufacturer manufacturer1 = new Manufacturer("Manufacturer1", 1900, "Poland");
        Manufacturer manufacturer2 = new Manufacturer("Manufacturer2", 1930, "Poland");
        Manufacturer manufacturer3 = new Manufacturer("Manufacturer3", 1940, "Poland");
        Manufacturer manufacturer4 = new Manufacturer("Manufacturer4", 1955, "Poland");
        Manufacturer manufacturer5 = new Manufacturer("Manufacturer5", 1969, "Poland");
        Manufacturer manufacturer6 = new Manufacturer("Manufacturer6", 1969, "Poland");
        Manufacturer manufacturer7 = new Manufacturer("Manufacturer7", 1973, "Poland");
        Manufacturer manufacturer8 = new Manufacturer("Manufacturer8", 1973, "Poland");
        Manufacturer manufacturer9 = new Manufacturer("Manufacturer9", 1989, "Poland");
        Manufacturer manufacturer10 = new Manufacturer("Manufacturer10", 2010, "Poland");
        Manufacturer manufacturer11 = new Manufacturer("Manufacturer11", 1900, "Poland");
        Manufacturer manufacturer12 = new Manufacturer("Manufacturer12", 1933, "Poland");
        Manufacturer manufacturer13 = new Manufacturer("Manufacturer13", 1940, "Poland");

        manufacturerList1.add(manufacturer1);
        manufacturerList1.add(manufacturer2);
        manufacturerList1.add(manufacturer3);
        manufacturerList1.add(manufacturer4);
        manufacturerList1.add(manufacturer5);
        manufacturerList1.add(manufacturer6);

        manufacturerList2.add(manufacturer3);
        manufacturerList2.add(manufacturer4);
        manufacturerList2.add(manufacturer5);
        manufacturerList2.add(manufacturer6);
        manufacturerList2.add(manufacturer7);
        manufacturerList2.add(manufacturer8);
        manufacturerList2.add(manufacturer9);

        manufacturerList3.add(manufacturer7);
        manufacturerList3.add(manufacturer8);
        manufacturerList3.add(manufacturer9);
        manufacturerList3.add(manufacturer10);
        manufacturerList3.add(manufacturer11);
        manufacturerList3.add(manufacturer12);

        manufacturerList4.add(manufacturer12);
        manufacturerList4.add(manufacturer13);

        Car car1 = new Car("Polonez", "XYZ", 20_000, 1960, manufacturerList1, EngineType.S6);
        Car car2 = new Car("Porsche", "ABC", 200_000, 2000, manufacturerList2, EngineType.V12);
        Car car3 = new Car("Jaguar", "12345", 250_000, 2010, manufacturerList3, EngineType.V8);
        Car car4 = new Car("Toyota", "Sho", 80_000, 1998, manufacturerList4, EngineType.V6);

        CarService carService = new CarService();
        carService.add(car1);
        carService.add(car2);
        carService.add(car3);
        carService.add(car4);

        System.out.println("All Cars");
        System.out.println(carService.getCars());
        System.out.println("V12 Engine");
        System.out.println(carService.getWithEngineV12());
        System.out.println("Before 1999");
        System.out.println(carService.getMadeBefore1999());
        System.out.println("Most Expensive");
        System.out.println(carService.getTheMostExpensive());
        System.out.println("The Cheapest");
        System.out.println(carService.getTheCheapest());
        System.out.println("At Least 3 Producers");
        System.out.println(carService.getWithAtLeastThreeProducers());
        System.out.println("Sorted By Name");
        System.out.println(carService.getSortedByName(true));
        System.out.println(carService.getSortedByName(false));
        System.out.println("Is Present");
        System.out.println(carService.isPresent(car1));
        System.out.println(carService.isPresent(new Car()));
        System.out.println("By Manufacturer");
        System.out.println(carService.getByManufacturer(manufacturer4));
        System.out.println("By Manufacturer and Year");
        System.out.println(">");
        System.out.println(carService.getByManufacturerAndProductionYear(manufacturer3, 1980, ">"));
        System.out.println("<");
        System.out.println(carService.getByManufacturerAndProductionYear(manufacturer8, 1980, "<"));
        System.out.println("=");
        System.out.println(carService.getByManufacturerAndProductionYear(manufacturer5, 1980, "="));
        System.out.println("!=");
        System.out.println(carService.getByManufacturerAndProductionYear(manufacturer9, 1980, "!="));
        System.out.println("Wrong parameter");
        System.out.println(carService.getByManufacturerAndProductionYear(manufacturer7, 1980, "something"));


    }
}
