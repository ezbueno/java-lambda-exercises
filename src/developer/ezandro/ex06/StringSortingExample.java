package developer.ezandro.ex06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringSortingExample {
    public static void main(String[] args) {

        // ===================================================================
        // APPROACH 1: Mutable List Sorting
        // - Creates a new mutable ArrayList
        // - Uses Collections.sort() for in-place sorting
        // - Returns modifiable list
        // ===================================================================
        StringSorter stringSorter = str -> {
            // Create a new mutable copy of the input list
            List<String> sortedList = new ArrayList<>(str);
            // Sort the list alphabetically (natural ordering)
            Collections.sort(sortedList);
            // Return the sorted mutable list
            return sortedList;
        };

        // Original unsorted languages list
        List<String> languages = Arrays.asList("Java", "C#", "Python", "JavaScript", "C", "PHP", "C++");
        // Sort using our first approach
        List<String> sortedLanguages = stringSorter.sort(languages);
        // Print each language in sorted order
        sortedLanguages.forEach(System.out::println);

        System.out.println("-----------------");

        // ===================================================================
        // APPROACH 2: Immutable List Sorting (Java 16+)
        // - Uses Stream API
        // - Returns immutable list via toList()
        // - More functional programming style
        // ===================================================================
        stringSorter = strings -> strings.stream()    // Convert to stream
                .sorted()                           // Sort alphabetically
                .toList();                           // Return immutable list

        // New set of languages to demonstrate different approach
        languages = Arrays.asList("Golang", "Pascal", "Cobol", "Kotlin", "Java", "C++");
        // Sort using our second (functional) approach
        sortedLanguages = stringSorter.sort(languages);
        // Print results
        sortedLanguages.forEach(System.out::println);
    }
}