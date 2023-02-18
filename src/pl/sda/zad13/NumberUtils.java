package pl.sda.zad13;

import java.util.*;
import java.util.stream.Collectors;

public class NumberUtils {

    public static List<Integer> findUniques(List<Integer> numbers) {
        Map<Integer, Integer> occurrences = countNumberOfOccurrencesEasy(numbers);
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    public static List<Integer> findOccurrencesMoreThanOne(List<Integer> numbers) {
        Map<Integer, Integer> occurrences = countNumberOfOccurrencesEasy(numbers);
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    public static List<Integer> findThe25MostCommonNumbers(List<Integer> numbers) {
        Map<Integer, Integer> occurrences = countNumberOfOccurrencesEasy(numbers);

        return  occurrences.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(25)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static List<Integer> deduplicate(List<Integer> numbers) {
        Map<Integer, Integer> occurrences = countNumberOfOccurrencesEasy(numbers);
        List<Integer> result = new ArrayList<>();
        Random random = new Random();
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
                for (int i = 0; i < entry.getValue() - 1; i++) {
                    int newNumber = random.nextInt(1_000_000 + 1);
                    while (result.contains(newNumber) || occurrences.containsKey(newNumber)) {
                        newNumber = random.nextInt(1_000_000 + 1);
                    }
                    result.add(newNumber);
                }
            } else {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    public static List<Integer> deduplicateEasy(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        Random random = new Random();
        for (Integer i : numbers) {
            if (result.contains(i)) {
                int newNumber = random.nextInt(1_000_000 + 1);
                while (result.contains(newNumber)) {
                    newNumber = random.nextInt(1_000_000 + 1);
                }
                result.add(newNumber);
            } else {
                result.add(i);
            }
        }

        return result;
    }



    public static List<Integer> getRandom100_000() {
        List<Integer> result = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100_000; i++) {
            int nextNumber = random.nextInt(1_000_000 + 1);
            result.add(nextNumber);
        }

        return result;
    }

    private static Map<Integer, Integer> countNumberOfOccurrences(List<Integer> numbers) {
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (Integer i : numbers) {
            if (occurrences.containsKey(i)) {
                int newValue = occurrences.get(i) + 1;
                occurrences.put(i, newValue);
            } else {
                occurrences.put(i, 1);
            }
        }

        return occurrences;
    }

    public static Map<Integer, Integer> countNumberOfOccurrencesEasy(List<Integer> numbers) {
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (Integer i : numbers) {
            occurrences.computeIfPresent(i, (key, value) -> value + 1);
            occurrences.putIfAbsent(i, 1);
        }

        return occurrences;
    }
}
