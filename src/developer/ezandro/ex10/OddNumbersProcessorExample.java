package developer.ezandro.ex10;

import java.util.Arrays;
import java.util.List;

public class OddNumbersProcessorExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, -3);

        List<Integer> transformedNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .toList();

        transformedNumbers.forEach(n ->
                System.out.println("Transformed odd number: " + n)
        );
    }
}