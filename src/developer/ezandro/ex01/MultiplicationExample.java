package developer.ezandro.ex01;

public class MultiplicationExample {
    public static void main(String[] args) {
        Multiplier multiplier = (a, b) -> a * b;
        System.out.println("Result: " + multiplier.multiply(2, 2));
    }
}