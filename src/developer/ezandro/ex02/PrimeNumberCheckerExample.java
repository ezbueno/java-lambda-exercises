package developer.ezandro.ex02;

public class PrimeNumberCheckerExample {
    public static void main(String[] args) {
        PrimeNumberChecker checker = n -> {
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

        System.out.println(checker.isPrime(11)); // true (is a prime number)
        System.out.println(checker.isPrime(12)); // false (is not a prime number)
    }
}