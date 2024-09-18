package recursionsortinginclass.FactorialClasses;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class FactorialIteratorEx3 implements Iterator<Integer> {
    private int aNumberForFactorialCalculation;
    private int aBaseCasePlaceHolder = 1;

    public FactorialIteratorEx3(int aNumberForFactorialCalculation) {
        this.aNumberForFactorialCalculation = aNumberForFactorialCalculation;
    }

    @Override
    public boolean hasNext() {
        return aNumberForFactorialCalculation >= aBaseCasePlaceHolder;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return aBaseCasePlaceHolder * aNumberForFactorialCalculation--; // Corrected logic
    }

    public int theFactorialOfTheNumberUsingRecursion() {
        return factorial(aNumberForFactorialCalculation); // Call helper method
    }

    private int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1); // Corrected recursion
    }

    public int theFactorialOfTheNumberUsingIterator() {
        aBaseCasePlaceHolder = 1; // Reset before calculation
        Iterator<Integer> iterator = new FactorialIteratorEx3(aNumberForFactorialCalculation);
        while (iterator.hasNext()) {
            aBaseCasePlaceHolder *= iterator.next();
        }
        return aBaseCasePlaceHolder;
    }
}