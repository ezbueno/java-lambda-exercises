package developer.ezandro.ex18;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StringConcatenatorExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        String commaSeparatedNames = concatenateNames(names);

        System.out.println(commaSeparatedNames);
    }

    /**
     * Exercise purpose: Practice Stream API.
     * For production code, consider using String.join() instead.
     */
    private static String concatenateNames(List<String> names) {
        return names.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.joining(", "));
    }
}