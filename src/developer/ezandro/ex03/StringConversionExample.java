package developer.ezandro.ex03;

public class StringConversionExample {
    public static void main(String[] args) {
        StringConverter converter = String::toUpperCase;
        System.out.println(converter.convert("java"));
    }
}