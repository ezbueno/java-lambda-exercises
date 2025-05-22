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

### Exercise 16: Maximum Number Finder  
**Package:** `developer.ezandro.ex16`  
Finds the maximum value in a list using `Stream.max()`.  
**Key Improvements:**  
- Dedicated method `findMaxNumber()` for reuse  
- Proper `Optional` handling with `ifPresentOrElse()`  
- Clear user feedback for empty lists  

### Exercise 17: Word Length Grouper  
**Package:** `developer.ezandro.ex17`  
Groups words by their length using `Collectors.groupingBy()`.  
**Key Concepts:**  
- `Collectors.groupingBy(classifier)`  
- Method reference (`String::length`)  
- Map<Integer, List<String>> structure  

**Example Output:**  
```
{4=[java, code], 6=[stream, lambda]}
```

### Exercise 18: String Concatenator  
**Package:** `developer.ezandro.ex18`  
**Objective:**  
- Practice Stream API with `Collectors.joining()`  
- Demonstrate null-safe string concatenation  

**Key Improvements:**  
- Descriptive variable name (`commaSeparatedNames`)  
- Production-ready with `Objects::nonNull` filter  
- Clear Javadoc about API choices  

**Output Example:**  
```
Alice, Bob, Charlie
```

### Exercise 19: Sum of Even Squares  
**Package:** `developer.ezandro.ex19`  
**Objective:**  
Calculate the sum of squares of even numbers using optimized stream operations.  

**Key Features:**  
- Null-safe by design (returns 0 for empty/no-even lists)  
- Primitive stream (`mapToInt`) for performance  
- Self-documenting method name  

**Example:**  
```
Input: [1, 2, 3, 4, 5, 6]  
Process: 2² + 4² + 6²  
Output: 56
```

### Exercise 20: Even/Odd Splitter  
**Package:** `developer.ezandro.ex20`  

**Objective:**  
Separate numbers into even/odd lists using `Collectors.partitioningBy()`.  

**Key Features:**  
- `Collectors.partitioningBy(n -> n % 2 == 0)`  
- Returns `Map<Boolean, List<Integer>>` where:  
  - `true` → Even numbers  
  - `false` → Odd numbers  
- **Note:** Not null-safe by default (add `filter(Objects::nonNull)` if needed)  

**Example Output:**  
```
{false=[1, 3, 5], true=[2, 4, 6]}
```

### Exercise 21: Product Category Grouper  
**Package:** `developer.ezandro.ex21`  
**Objective:**  
Group products by category using `Collectors.groupingBy()`.  

**Key Features:**  
- Method reference (`Product::category`)  
- Immutable record (`Product`) usage  
- Clean constant definitions for categories  

**Example Output:**  
```
Category: Electronics
- Smartphone ($800.00)
- Keyboard ($200.00)
- Monitor ($900.00)

Category: Furniture
- Chair ($300.00)
- Desk ($700.00)
```

### Exercise 22: Product Category Counter  
**Package:** `developer.ezandro.ex22`  
**Objective:**  
Count products per category using downstream collectors.  

**Key Features:**  
- `Collectors.groupingBy` + `Collectors.counting()`  
- Immutable record usage  
- Type-safe mapping (`Map<String, Long>`)  

**Example Output:**  
```
Electronics: 3 product(s)
Furniture: 2 product(s)
```

### Exercise 23: Category Price Leader  
**Package:** `developer.ezandro.ex23`  
**Objective:**  
Find the most expensive product in each category with proper `Optional` handling.  

**Key Improvements:**  
- Safe `Optional` unwrapping with `ifPresentOrElse`  
- Null-safe terminal operation  
- Clear price formatting  

**Example Output:**  
```
Electronics: Monitor - $900.0
Furniture: Desk - $700.0
```

### Exercise 24: Category Price Sum Calculator  
**Package:** `developer.ezandro.ex24`  

**Objective:**  
Calculate the total price of products per category using Stream API.  

**Key Concepts:**  
- `Collectors.groupingBy()` + `summingDouble()`  
- Method references (`Product::category`, `Product::price`)  
- Formatted monetary output  


**Example Output:**  
```
Electronics: $1900.0
Furniture: $1000.0 
```

### Key Concepts Practiced  
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
