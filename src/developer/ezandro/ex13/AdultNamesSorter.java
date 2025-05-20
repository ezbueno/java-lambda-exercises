package developer.ezandro.ex13;

import java.util.Arrays;
import java.util.List;

public class AdultNamesSorter {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 22),
                new Person("Bob", 17),
                new Person("Charlie", 19)
        );

        List<String> sortedNames = people.stream()
                .filter(p -> p.age() > 18)
                .map(Person::name)
                .sorted()
                .toList();

        sortedNames.forEach(System.out::println);
    }
}