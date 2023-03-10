package pl.sda.zad5;

import java.util.ArrayList;
import java.util.List;

public class SDAHashSet<E> {

    private final List<E> elements = new ArrayList<>();

    public boolean add(E e) {
        if (elements.contains(e)) {
            return false;
        } else {
            elements.add(e);
            return true;
        }
    }

    public boolean remove(E e) {
        if (elements.contains(e)) {
            elements.remove(e);
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return elements.size();
    }

    public boolean contains(E e) {
        return elements.contains(e);
    }

    public void clear() {
        elements.clear();
    }


    public boolean addWorstVersion(E e) {
        boolean isValid = true;
        for (E element : elements) {
            if (element.equals(e)) {
                isValid = false;
                break;
            }
        }

        if (isValid) {
            elements.add(e);
        }

        return isValid;
    }
}
