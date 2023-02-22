package pl.bonus.zad3_zad4_zad5_zad6_pdf_java_zaawansowana_programowanie;

import java.util.List;
import java.util.stream.Collectors;

public class StreamUtils {

    public static double calculateAverage(List<Integer> number) {
        return number.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0);
    }

    public static List<String> toUpperCase(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static List<String> findStartingWithSmallAWithLengthThree(List<String> strings) {
        return strings.stream()
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());
    }

    public static String getOddAndEven(List<Integer> numbers) {
        String result = numbers.stream()
                .map(i -> {
                    if (i % 2 == 0) {
                        return "e" + i + ", ";
                    } else {
                        return "o" + i + ", ";
                    }
                }).collect(Collectors.joining());

        return result.substring(1, result.length() - 2);
    }
}
