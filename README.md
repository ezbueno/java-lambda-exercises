# Java Lambda Expressions Exercises

This repository contains a series of exercises to practice Java lambda expressions and functional interfaces. Exercises are organized in separate packages (`ex01` to `ex15`).

## Exercises

### Exercise 1: Integer Multiplication
**Package:** `developer.ezandro.ex01`  
Implement a lambda expression that multiplies two integers using a functional interface with `multiplicacao(int a, int b)`.

### Exercise 2: Prime Number Check
**Package:** `developer.ezandro.ex02`  
Create a lambda expression to check if a number is prime.  
**Includes:** `PrimeUtils` utility class for reusable prime-checking logic.

### Exercise 3: String Uppercase Conversion
**Package:** `developer.ezandro.ex03`  
Convert strings to uppercase using:  
- Regular lambda: `str -> str.toUpperCase()`  
- Method reference: `String::toUpperCase` (preferred)

### Exercise 4: Palindrome Checker
**Package:** `developer.ezandro.ex04`  
Lambda to check palindromes using `StringBuilder.reverse()`.

### Exercise 5: List Transformation
**Package:** `developer.ezandro.ex05`  
Transform a list by multiplying each integer by 3.

### Exercise 6: String List Sorting
**Package:** `developer.ezandro.ex06`  
Sort strings alphabetically using `Collections.sort`.

### Exercise 7: Safe Division
**Package:** `developer.ezandro.ex07`  
Lambda that divides two numbers, throwing `ArithmeticException` for division by zero.

### Exercise 8: Filter Even Numbers
**Package:** `developer.ezandro.ex08`  
Filter and print even numbers from a list.

### Exercise 9: Uppercase String Conversion
**Package:** `developer.ezandro.ex09`  
Convert a list of strings to uppercase and print.

### Exercise 10: Odd Numbers Doubled
**Package:** `developer.ezandro.ex10`  
Filter odd numbers, multiply by 2, and collect results.

### Exercise 11: Remove Duplicate Strings
**Package:** `developer.ezandro.ex11`  
Remove duplicates from a string list.

### Exercise 12: Extract and Sort Primes
**Package:** `developer.ezandro.ex12`  
Extract primes from nested lists, sort ascending.  
**Reuses:** `PrimeUtils` from `ex02`.

### Exercise 13: Filter Adults by Name
**Package:** `developer.ezandro.ex13`  
Filter people over 18, extract names, and print alphabetically.

### Exercise 14: Filter and Sort Electronics
**Package:** `developer.ezandro.ex14`  
Filter electronics under R$1000, sort by price.  
**Uses:** `Product` record from shared model.

### Exercise 15: Top 3 Cheapest Electronics
**Package:** `developer.ezandro.ex15`  
Extension of `ex14` showing only the 3 cheapest electronics.

## Key Concepts Practiced  
- Lambda expressions syntax  
- Functional interfaces  
- Collections operations (`filter`, `map`, `sorted`, `distinct`)  
- Method references (`String::toUpperCase`, `Person::getName`)  
- Immutable data with `record` (Java 17+)  
- Exception handling in lambdas (unchecked exceptions)  
- Utility classes (`PrimeUtils`) and shared models (`Product`)  

## How to Use
1. Navigate to each package (`ex01`-`ex15`)  
2. Run the `*Example` class's `main()` method  
3. Observe console output for results  

## Requirements  
- **Java 17+** (for `record` and modern features)  
- IDE recommended (IntelliJ, Eclipse, etc.)  
**Note:** Tested with Java 24 but compatible with Java 17+.
