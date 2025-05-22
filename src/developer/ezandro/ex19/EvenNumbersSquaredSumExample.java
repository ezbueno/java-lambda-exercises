package developer.ezandro.ex19;

import java.util.Arrays;
import java.util.List;

public class EvenNumbersSquaredSumExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        int result = sumOfEvenSquares(numbers);

        System.out.println(result);
    }

    /**
     * Calculates the sum of squares of even numbers.
     * Returns 0 if the list contains no even numbers.
     */
    private static int sumOfEvenSquares(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * n)
                .sum();
    }
}