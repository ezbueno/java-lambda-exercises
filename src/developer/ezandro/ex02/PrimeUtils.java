package developer.ezandro.ex02;

public class PrimeUtils {
    private PrimeUtils() {
    }

    public static final PrimeNumberChecker IS_PRIME = n -> {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    };
}