Understand the recursion use in the fibonacci sequence and the factorial sequence in java.


Here's a brief explanation and implementation of recursion in Java for both the Fibonacci sequence and the factorial sequence.

### Explanation
- **Fibonacci Sequence:** Each number is the sum of the two preceding ones, usually starting with 0 and 1.
- **Factorial Sequence:** The product of all positive integers up to a given number \( n \).

### Java Implementation
```java
// Fibonacci sequence using recursion
public class RecursionExamples {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }

    // Factorial using recursion
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case
        }
        return n * factorial(n - 1); // Recursive case
    }

    public static void main(String[] args) {
        int fibIndex = 5; // Example index for Fibonacci
        System.out.println("Fibonacci of " + fibIndex + " is: " + fibonacci(fibIndex));

        int factNumber = 5; // Example number for factorial
        System.out.println("Factorial of " + factNumber + " is: " + factorial(factNumber));
    }
}
```

### Summary
- The `fibonacci` method calculates the Fibonacci number at a given index using recursion.
- The `factorial` method computes the factorial of a number recursively.
- The `main` method demonstrates how to call these functions and print the results.