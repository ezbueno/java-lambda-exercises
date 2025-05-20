package developer.ezandro.ex12;

import developer.ezandro.ex02.PrimeNumberChecker;
import developer.ezandro.ex02.PrimeUtils;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class PrimeNumberExtractor {
    public static void main(String[] args) {
        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );


        List<Integer> primeNumbers = numbers.stream()
                .flatMap(List::stream)
                .filter(PrimeUtils.IS_PRIME::isPrime)
                .sorted()
                .toList();

        primeNumbers.forEach(System.out::println);
    }
}