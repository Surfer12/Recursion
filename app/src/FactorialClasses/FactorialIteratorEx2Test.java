package FactorialClasses;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialIteratorEx2Test {

      @Test
      public void testFactorialUsingIteration() {
         FactorialIteratorEx2 factorialIterator = new FactorialIteratorEx2(5);
         assertEquals(120, factorialIterator.theFactorialOfTheNumber());
      }

      @Test
      public void testFactorialUsingIterator() {
         FactorialIteratorEx2 factorialIterator = new FactorialIteratorEx2(5);
         assertEquals(120, factorialIterator.theFactorialOfTheNumberUsingIterator());
      }

      @Test
      public void testFactorialUsingRecursion() {
         FactorialIteratorEx2 factorialIterator = new FactorialIteratorEx2(5);
         assertEquals(120, factorialIterator.theFactorialOfTheNumberUsingRecursion(5));
      }

      @Test
      public void testHasNext() {
         FactorialIteratorEx2 factorialIterator = new FactorialIteratorEx2(5);
         assertTrue(factorialIterator.hasNext());
         factorialIterator.next();
         assertTrue(factorialIterator.hasNext());
         factorialIterator.next();
         factorialIterator.next();
         factorialIterator.next();
         factorialIterator.next();
         assertFalse(factorialIterator.hasNext());
      }

      @Test
      public void testNext() {
         FactorialIteratorEx2 factorialIterator = new FactorialIteratorEx2(5);
         assertEquals(5, factorialIterator.next());
         assertEquals(4, factorialIterator.next());
         assertEquals(3, factorialIterator.next());
         assertEquals(2, factorialIterator.next());
         assertEquals(1, factorialIterator.next());
      }

      @Test
      public void testRemove() {
         FactorialIteratorEx2 factorialIterator = new FactorialIteratorEx2(5);
         assertThrows(UnsupportedOperationException.class, factorialIterator::remove);
      }
   }
