Understand the recursion use in the fibonacci sequence and the factorial sequence in java.

Flowchart of the java code that impliements the iterator interface for factorial sequence.

Understand how breaking problem down into the base case and recursive case can be applied to other problems.

Traversing a tree using recursion. Understand how the recursive method is called and how it traverses the tree and why that is understandable and how it is different from an iterative approach. 


Here's a brief explanation and implementation of recursion in Java for both the Fibonacci sequence and the factorial sequence.

Understand how breaking problems down into the base case and recursive case can be applied to other problems.

### Examples

1. **Binary Search:**
   - **Base Case:** If the array is empty or the target is found.
   - **Recursive Case:** Divide the array in half and search in the appropriate half.

2. **Merge Sort:**
   - **Base Case:** If the array has one or zero elements, it is already sorted.
   - **Recursive Case:** Split the array into two halves, sort each half, and then merge them.

3. **Tower of Hanoi:**
   - **Base Case:** Move a single disk directly to the target peg.
   - **Recursive Case:** Move the top n-1 disks to an auxiliary peg, move the nth disk to the target peg, and then move the n-1 disks from the auxiliary peg to the target peg.

4. **Permutations of a String:**
   - **Base Case:** If the string is empty, return an empty list.
   - **Recursive Case:** For each character in the string, fix it and recursively find permutations of the remaining characters.

5. **N-Queens Problem:**
   - **Base Case:** If all queens are placed, return the solution.
   - **Recursive Case:** Place a queen in a valid position and recursively attempt to place the next queen.

6. **Tree Traversals (In-order, Pre-order, Post-order):**
   - **Base Case:** If the tree is empty, return.
   - **Recursive Case:** Visit the root, then traverse the left subtree, and finally traverse the right subtree.

7. **Quick Sort:**
   - **Base Case:** If the array has one or zero elements, it is already sorted.
   - **Recursive Case:** Choose a pivot, partition the array, and recursively sort the subarrays.



### Explanation
- **Fibonacci Sequence:** Each number is the sum of the two preceding ones, usually starting with 0 and 1.
- **Factorial Sequence:** The product of all positive integers up to a given number \( n \).

### Java Implementation
```java
// Fibonacci sequence using recursion
public class RecursionExamples {

    public static int fibonacci(int n) {
        if (n <= 1) { // base case of 1 and 0 return themselves. 
            return n; // Base case
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
        // fibonacci(5) = fibonacci(4) + fibonacci(3)
        // f(n) = f(n-1) + f(n-2) for n > 1
    }

    // Factorial using recursion
    public static int factorial(int n) {
        if (n == 0) { // 0! = 1 
            return 1; // Base case 
        }
        return n * factorial(n - 1); // Recursive case, n! = n * (n-1)!
    }

    /* factorial(5)
 ├── 5 * factorial(4)
 │    ├── 4 * factorial(3)
 │    │    ├── 3 * factorial(2)
 │    │    │    ├── 2 * factorial(1)
 │    │    │    │    ├── 1 * factorial(0)
 │    │    │    │    │    └── 1 (base case)
 │    │    │    │    └── 1
 │    │    │    └── 2
 │    │    └── 6
 │    └── 24
 └── 120 */

    public static void main(String[] args) {
        int fibIndex = 5; // Example index for Fibonacci
        System.out.println("Fibonacci of " + fibIndex + " is: " + fibonacci(fibIndex));

        int factNumber = 5; // Example number for factorial
        System.out.println("Factorial of " + factNumber + " is: " + factorial(factNumber));
    }
}
```
```java
import java.util.Iterator;

/**
 * This class calculates the factorial of a given number using a custom
 * iterator.
 * It demonstrates the use of an iterator to perform a calculation that involves
 * iterating over a sequence of numbers.
 */
public class FactorialWithIterator {
    private int number;

    /**
     * Constructor to initialize the number for which the factorial is to be
     * calculated.
     * 
     * @param number The number for which the factorial is to be calculated.
     */
    public FactorialWithIterator(int number) {
        this.number = number;
    }

    /**
     * Getter method to retrieve the number.
     * 
     * @return The number for which the factorial is to be calculated.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Setter method to set the number.
     * 
     * @param number The new number for which the factorial is to be calculated.
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Custom iterator for factorial calculation. This iterator generates a sequence
     * of numbers from 1 to the number set in the class, which is then used to
     * calculate
     * the factorial.
     */
    private class FactorialIterator implements Iterator<Integer> {
        private int current = 1;

        /**
         * Checks if there are more numbers in the sequence.
         * 
         * @return An Optional containing true if there are more numbers, false
         *         otherwise.
         */
        @Override
        public boolean hasNext() {
            return current <= number;
        }

        /**
         * Returns the next number in the sequence. If there are no more numbers,
         * it returns an empty Optional.
         * 
         * @return An Optional containing the next number in the sequence.
         */
        @Override
        public Integer next() {
            if (!hasNext()) {
                return null;
            }
            return current++;
        }
    }

    /**
     * Calculates the factorial of the number using the custom iterator.
     * 
     * @return The factorial of the number.
     */
    public int calculateFactorial() {
        int factorial = 1;
        Iterator<Integer> iterator = new FactorialIterator();
        while (iterator.hasNext()) {
            factorial *= iterator.next();
        }
        return factorial;
    }

    /**
     * Main method to test the FactorialWithIterator class.
     * 
     * @param args Command line arguments.
     */
```


### Summary
- The `fibonacci` method calculates the Fibonacci number at a given index using recursion.
- The `factorial` method computes the factorial of a number recursively.
- The `main` method demonstrates how to call these functions and print the results.