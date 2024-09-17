/* <!-- To implement an iterator for a concept like calculating the factorial, you can follow these steps:
1. Define the Class Structure

Create a main class (e.g., FactorialWithIterator) that holds the number for which you want to calculate the factorial.
Inside this class, define a private inner class that implements the Iterator interface.

2. Implement the Iterator
The inner class should maintain the current state of the iteration (e.g., the current number).

Implement the hasNext() method to check if there are more numbers to iterate over (i.e., if the current number is less than or equal to the target number).

Implement the next() method to return the current number and increment it for the next call.

3. Calculate Factorial Using the Iterator
In the main class, create a method (e.g., calculateFactorial()) that uses the iterator to multiply the numbers from 1 to the target number.

4. Testing the Implementation
Create a main method to instantiate the class and test the factorial calculation. --> */

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
    public static void main(String[] args) {
        FactorialWithIterator factorial = new FactorialWithIterator(5);
        System.out.println("Factorial of " + factorial.getNumber() + " is " + factorial.calculateFactorial());
    }
}