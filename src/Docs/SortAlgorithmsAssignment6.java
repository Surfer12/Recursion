/**
 * Assignment 6: Implement insertion and selection sort algorithms in Java.
 * This class provides methods to perform insertion sort and selection sort
 * on an array of integers, along with an analysis of their time complexity.
 */
package Docs;
import java.util.Arrays;

public class SortAlgorithmsAssignment6 {

    /**
     * Performs insertion sort on the given array.
     * Recieves an array of integers 
     * i counter is initialized to 1 
     * j counter is initialized to i - 1
     * key is initialized to array[i]
     * This key is used to compare with the previous elements in the array
     * If the key is less than the previous element, then the previous element is shifted to the right
     * This process is repeated until the key is greater than the previous element
     * The key is then inserted into the array
     * 
     *
     * @param array the array to be sorted
     */
    public static void insertionSort(int[] array) {
        int n = array.length; 
        for(int i = 1; i < n; i++)//noinspection DuplicatedCode
        {
            int key = array[i]; 
            int j = i - 1;
            while(j >= 0 && array[j] > key){
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    /**
     * Performs insertion sort on the given array and logs each step.
     *
     * @param array the array to be sorted
     */
    public static void insertionSortWithLogging(int[] array) {
        int n = array.length; 
        for(int i = 1; i < n; i++)//noinspection DuplicatedCode
        {
            int key = array[i]; 
            int j = i - 1;
            while(j >= 0 && array[j] > key){
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
            // Log the current state of the array after each insertion
            System.out.println("Step " + i + ": " + Arrays.toString(array));
        }
    }

    /**
     * Performs selection sort on the given array.
     * 
     * This method iterates through the array, starting from the first element, to find the smallest element in the unsorted part of the array.
     * It initializes a variable `minIndex` to the current index `i`, assuming the current element is the smallest.
     * Then, it iterates from `i + 1` to the end of the array, comparing each element with the current smallest element.
     * If a smaller element is found, `minIndex` is updated to the index of the smaller element.
     * After finding the smallest element, it swaps the smallest element with the first element of the unsorted part of the array.
     * This process is repeated for each element in the array, effectively sorting the array in ascending order.
     * 
     * @param array the array to be sorted
     */
    public static void selectionSort(int[] array) {
        @SuppressWarnings("DuplicatedCode") int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
            // Log the current state of the array after each selection
            System.out.println("Step " + (i + 1) + ": " + Arrays.toString(array));
        }
    }
    
    /**
     * Performs selection sort on the given array and logs each step.
     * 
     * @param array the array to be sorted
     */
    public static void selectionSortWithLogging(int[] array) {
        @SuppressWarnings("DuplicatedCode") int n = array.length;
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
            // Log the current state of the array after each selection
            System.out.println("Step " + (i + 1) + ": " + Arrays.toString(array));
        }
    }

    /**
     * Analyzes the time complexity of the sorting algorithms.
     * 
     * Insertion Sort: O(n^2) in the worst case, O(n) in the best case.
     * Selection Sort: O(n^2) in all cases.
     */
    public static void analyzeTimeComplexity() {
        System.out.println("Time Complexity Analysis:");
        System.out.println("Insertion Sort:");
        System.out.println("  - Worst Case: O(n^2) when the array is sorted in reverse order.");
        System.out.println("  - Best Case: O(n) when the array is already sorted.");
        System.out.println("  - Average Case: O(n^2) for random order.");
        
        System.out.println("Selection Sort:");
        System.out.println("  - Time Complexity: O(n^2) in all cases, as it always goes through the entire array.");
    }
}