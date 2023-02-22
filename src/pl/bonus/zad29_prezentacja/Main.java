package pl.bonus.zad29_prezentacja;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        GenericsExample<Integer> integerGenericsExample = new GenericsExample<>();
        GenericsExample<String> stringGenericsExample = new GenericsExample<>();

        Integer[] myInts = {10, 56, -100, 13, 21, 65, -190, -17, -22};
        String[] myStrings = {"Abc", "Some word", "Hello", "Czesc", "XYZA"};

        Predicate<Integer> integerPredicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };

        Predicate<String> stringPredicate = (string) -> string.length() > 6;

        System.out.println(integerGenericsExample.partOf(myInts, integerPredicate));
        System.out.println(stringGenericsExample.partOf(myStrings, stringPredicate));
    }
}
