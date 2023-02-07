package pl.sda.zad3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> myMap = new HashMap<>();

        myMap.put("Object1", 1);
        myMap.put("Object10", 10);
        myMap.put("Object7", 7);
        myMap.put("Object5", 5);
        myMap.put("Object8", 8);
        myMap.put("Object99", 99);
        myMap.put("Object100", 100);
        myMap.put("Object12", 12);

        MapPrinter.printElements(myMap);

    }
}
