import java.util.Iterator;


// next method, hasNext method, remove method

public class FactorialIteratorEx2 implements Iterator<Integer> {
    private int number;
    private int current;

    public FactorialIteratorEx2(int number) {
        this.number = number;
        this.current = 1;
    }

    @Override
    public boolean hasNext() {
        return current <= number;
    }

    @Override
    public Integer next() {
        return current++;
    }
}
