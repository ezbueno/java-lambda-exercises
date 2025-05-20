package developer.ezandro.ex09;

import java.util.Arrays;
import java.util.List;

public class UppercaseStringsExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "lambda");

        List<String> toUpperCase = words.stream()
                .map(String::toUpperCase)
                .toList();

        toUpperCase.forEach(word -> System.out.println("Uppercase: " + word));
    }
}