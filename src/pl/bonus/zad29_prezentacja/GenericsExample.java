package pl.bonus.zad29_prezentacja;

import java.util.function.Predicate;

public class GenericsExample<T> {

    public double partOf(T[] elements, Predicate<T> predicate) {
        double counter = 0;
        for (T element : elements) {
            if (predicate.test(element)) {
                counter++;
            }
        }

        return counter / elements.length * 100;
    }

}
