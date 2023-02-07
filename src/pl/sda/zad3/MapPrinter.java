package pl.sda.zad3;

import java.util.Map;

public class MapPrinter {

    public static void printElements(Map<String, Integer> map) {

        //Alternatywny sposób dostępu do par klucz-wartość
        //Set<Map.Entry<String, Integer>> entries = map.entrySet();

        int counter = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (map.size() - 1 > counter) {
                System.out.println("Klucz: " + entry.getKey() + " Wartość: " + entry.getValue() + ",");
            } else {
                System.out.println("Klucz: " + entry.getKey() + " Wartość: " + entry.getValue() + ".");
            }

            counter++;
        }
    }
}
