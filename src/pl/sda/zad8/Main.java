package pl.sda.zad8;

public class Main {

    public static void main(String[] args) {

        Parcel parcel_1 = new Parcel(40, 40, 40, 20.0f, false);
        Validator validator = new ValidatorImpl();
        boolean result_1 = validator.validate(parcel_1);
        System.out.println(result_1);
    }
}
