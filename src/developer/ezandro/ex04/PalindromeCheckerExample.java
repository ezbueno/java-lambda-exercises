package developer.ezandro.ex04;

public class PalindromeCheckerExample {
    public static void main(String[] args) {
        PalindromeChecker palindromeChecker = str ->
                str.contentEquals(new StringBuilder(str).reverse());

        System.out.println(palindromeChecker.isPalindrome("radar")); // true
        System.out.println(palindromeChecker.isPalindrome("java")); // false
    }
}