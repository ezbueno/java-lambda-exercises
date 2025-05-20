package developer.ezandro.ex06;

import java.util.List;

@FunctionalInterface
public interface StringSorter {
    List<String> sort(List<String> strings);
}