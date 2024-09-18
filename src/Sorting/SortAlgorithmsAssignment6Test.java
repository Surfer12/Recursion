package Sorting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortAlgorithmsAssignment6Test {

        @Test
        void insertionSort_sortsArrayCorrectly() {
            int[] array = {5, 2, 9, 1, 5, 6};
            SortAlgorithmsAssignment6.insertionSort(array);
            assertArrayEquals(new int[]{1, 2, 5, 5, 6, 9}, array);
        }

        @Test
        void insertionSort_handlesEmptyArray() {
            int[] array = {};
            SortAlgorithmsAssignment6.insertionSort(array);
            assertArrayEquals(new int[]{}, array);
        }

        @Test
        void insertionSort_handlesSingleElementArray() {
            int[] array = {1};
            SortAlgorithmsAssignment6.insertionSort(array);
            assertArrayEquals(new int[]{1}, array);
        }

        @Test
        void insertionSort_handlesAlreadySortedArray() {
            int[] array = {1, 2, 3, 4, 5};
            SortAlgorithmsAssignment6.insertionSort(array);
            assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
        }

        @Test
        void insertionSort_handlesReverseSortedArray() {
            int[] array = {5, 4, 3, 2, 1};
            SortAlgorithmsAssignment6.insertionSort(array);
            assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
        }

        @Test
        void selectionSort_sortsArrayCorrectly() {
            int[] array = {5, 2, 9, 1, 5, 6};
            SortAlgorithmsAssignment6.selectionSort(array);
            assertArrayEquals(new int[]{1, 2, 5, 5, 6, 9}, array);
        }

        @Test
        void selectionSort_handlesEmptyArray() {
            int[] array = {};
            SortAlgorithmsAssignment6.selectionSort(array);
            assertArrayEquals(new int[]{}, array);
        }

        @Test
        void selectionSort_handlesSingleElementArray() {
            int[] array = {1};
            SortAlgorithmsAssignment6.selectionSort(array);
            assertArrayEquals(new int[]{1}, array);
        }

        @Test
        void selectionSort_handlesAlreadySortedArray() {
            int[] array = {1, 2, 3, 4, 5};
            SortAlgorithmsAssignment6.selectionSort(array);
            assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
        }

        @Test
        void selectionSort_handlesReverseSortedArray() {
            int[] array = {5, 4, 3, 2, 1};
            SortAlgorithmsAssignment6.selectionSort(array);
            assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
        }
    }

