package FactorialClasses;
import java.util.Iterator;

// next method, hasNext method, remove method
//impliments iterator interface to calculate the factorial of a given number
public class FactorialIteratorEx2 implements Iterator<Integer> {
    private int aNumberForFactorialCalculation;
    private int aBaseCasePlaceHolder = 1;

    public FactorialIteratorEx2(int aNumberForFactorialCalculation) {
        this.aNumberForFactorialCalculation = aNumberForFactorialCalculation;
    }

    @Override
    public boolean hasNext() {
        return aNumberForFactorialCalculation >= aBaseCasePlaceHolder;
    }

    @Override
    public Integer next() {
        return aNumberForFactorialCalculation--;
    }

    public int theFactorialOfTheNumber() {
        for (int i = 1; i <= aNumberForFactorialCalculation; i++) {
            aBaseCasePlaceHolder *= i;
        }
        return aBaseCasePlaceHolder;
    }

    public int theFactorialOfTheNumberUsingRecursion(int aNumberForFactorialCalculation) {
        if (aNumberForFactorialCalculation == 0) {
            return 1;
        }
        return aNumberForFactorialCalculation * theFactorialOfTheNumberUsingRecursion(aNumberForFactorialCalculation - 1);
    }

    public int theFactorialOfTheNumberUsingIterator() {
        Iterator<Integer> iterator = new FactorialIteratorEx2(aNumberForFactorialCalculation);
        while (iterator.hasNext()) {
            aBaseCasePlaceHolder *= iterator.next();
        }
        return aBaseCasePlaceHolder;
    }

    
}
