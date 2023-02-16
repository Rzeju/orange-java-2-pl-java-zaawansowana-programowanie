package pl.sda.zad12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    private final List<Car> cars = new ArrayList<>();

    public void add(Car car) {
        cars.add(car);
    }

    public void delete(Car car) {
        cars.remove(car);
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getWithEngineV12() {
        return cars.stream()
                .filter(c -> c.getEngineType() == EngineType.V12)
                .collect(Collectors.toList());
    }

    public List<Car> getMadeBefore1999() {
        return cars.stream()
                .filter(c -> c.getProductionYear() < 1999)
                .collect(Collectors.toList());
    }

    public Car getTheMostExpensive() {
        return cars.stream()
                .max(Comparator.comparingInt(Car::getPrice))
                .get();
    }

    public Car getTheCheapest() {
        return cars.stream()
                .min(Comparator.comparingInt(Car::getPrice))
                .get();
    }

    public Car getWithAtLeastThreeProducers() {
        return cars.stream()
                .filter(c -> c.getManufacturers().size() >= 3)
                .findFirst()
                .get();
    }

    public List<Car> getSortedByName(boolean ascending) {
        final Comparator<String> comparator;
        if (ascending) {
            comparator = String.CASE_INSENSITIVE_ORDER;
        } else {
            comparator = String.CASE_INSENSITIVE_ORDER.reversed();
        }

        return cars.stream()
                .sorted((c1, c2) -> comparator.compare(c1.getName(), c2.getName()))
                .collect(Collectors.toList());
    }

    public boolean isPresent(Car car) {
        return cars.contains(car);
    }

    public List<Car> getByManufacturer(Manufacturer manufacturer) {
        return cars.stream()
                .filter(c -> c.getManufacturers().contains(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Car> getByManufacturerAndProductionYear(Manufacturer manufacturer, int productionYear, String comparingKind) {

        List<Car> result;

        switch (comparingKind) {
            case "<":
                result = cars.stream()
                        .filter(c -> c.getProductionYear() < productionYear)
                        .filter(c -> c.getManufacturers().contains(manufacturer))
                        .collect(Collectors.toList());
                break;
            case "<=":
                result = cars.stream()
                        .filter(c -> c.getProductionYear() <= productionYear)
                        .filter(c -> c.getManufacturers().contains(manufacturer))
                        .collect(Collectors.toList());
                break;
            case ">":
                result = cars.stream()
                        .filter(c -> c.getProductionYear() > productionYear)
                        .filter(c -> c.getManufacturers().contains(manufacturer))
                        .collect(Collectors.toList());
                break;
            case ">=":
                result = cars.stream()
                        .filter(c -> c.getProductionYear() >= productionYear)
                        .filter(c -> c.getManufacturers().contains(manufacturer))
                        .collect(Collectors.toList());
                break;
            case "=":
                result = cars.stream()
                        .filter(c -> c.getProductionYear() == productionYear)
                        .filter(c -> c.getManufacturers().contains(manufacturer))
                        .collect(Collectors.toList());
                break;
            case "!=":
                result = cars.stream()
                        .filter(c -> c.getProductionYear() != productionYear)
                        .filter(c -> c.getManufacturers().contains(manufacturer))
                        .collect(Collectors.toList());
                break;
            default:
                result = cars.stream()
                        .filter(c -> c.getManufacturers().contains(manufacturer))
                        .collect(Collectors.toList());
                System.out.println("Podano niewłaściwy parametr sortowania");
        }

        return result;
    }
}
