package developer.ezandro.ex17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordLengthGrouperExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "lambda", "code");

        Map<Integer, List<String>> groupWords = groupWordsByLength(words);

        System.out.println(groupWords);
    }

    private static Map<Integer, List<String>> groupWordsByLength(List<String> words) {
        return words.stream()
                .collect(Collectors.groupingBy(String::length));
    }
}