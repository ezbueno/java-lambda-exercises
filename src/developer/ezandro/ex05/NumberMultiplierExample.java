package developer.ezandro.ex05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberMultiplierExample {
    public static void main(String[] args) {

        NumberMultiplier numberMultiplier = numbers -> {
            List<Integer> result = new ArrayList<>();
            for (Integer num : numbers) {
                result.add(num * 3);
            }
            return result;
        };

        List<Integer> originalNumbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> multipliedNumbers = numberMultiplier.multiplyByThree(originalNumbers);

        System.out.println("Original: " + originalNumbers);
        System.out.println("Multiplied by 3: " + multipliedNumbers);
    }
}