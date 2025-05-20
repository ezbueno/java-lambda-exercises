package developer.ezandro.ex11;

import java.util.Arrays;
import java.util.List;

public class UniqueStringsPrinter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana");

        List<String> uniqueStrings = words.stream().distinct().toList();

        System.out.println("Original list: " + words);
        System.out.println("Unique values: ");
        uniqueStrings.forEach(System.out::println);
    }
}