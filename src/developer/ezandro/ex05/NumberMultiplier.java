package developer.ezandro.ex05;

import java.util.List;

@FunctionalInterface
public interface NumberMultiplier {
    List<Integer> multiplyByThree(List<Integer> numbers);
}