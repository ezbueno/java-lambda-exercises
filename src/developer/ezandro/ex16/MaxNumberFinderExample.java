package developer.ezandro.ex16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxNumberFinderExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        Optional<Integer> maxNumber = findMaxNumber(numbers);

        maxNumber.ifPresentOrElse(
                max -> System.out.println("The max number is: " + max),
                () -> System.out.println("List is empty!")
        );
    }

    private static Optional<Integer> findMaxNumber(List<Integer> numbers) {
        return numbers.stream().max(Comparator.naturalOrder());
    }
}