package developer.ezandro.ex07;

public class DivisionExample {
    public static void main(String[] args) {
        BinaryDivision binaryDivision = (a, b) -> a / b;

        testDivision(binaryDivision, 8, 2);
        testDivision(binaryDivision, 5, 0);
    }

    private static void testDivision(BinaryDivision op, int a, int b) {
        try {
            System.out.printf("%d / %d = %d%n", a, b, op.divide(a, b));
        } catch (ArithmeticException e) {
            System.err.printf("Error in %d / %d: %s%n", a, b, e.getMessage());
        }
    }
}