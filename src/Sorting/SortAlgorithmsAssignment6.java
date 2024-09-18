/**
 * Assignment 6: Implement insertion and selection sort algorithms in Java.
 * This class provides methods to perform insertion sort and selection sort
 * on an array of integers, along with an analysis of their time complexity.
 */
package Docs;
import java.util.Arrays;

public class SortAlgorithmsAssignment6 {

    /**
     * Performs insertion sort on the given array of integers.
     * 
     * Algorithm steps:
     * 1. Iterate through the array starting from the second element (index 1).
     * 2. For each iteration:
     *    a. Store the current element as the 'key'.
     *    b. Compare the key with the previous elements in the sorted portion.
     *    c. Shift larger elements to the right to make space for the key.
     *    d. Insert the key in its correct position in the sorted portion.
     * 
     * Time complexity:
     * - Worst case: O(n^2) when the array is in reverse order.
     * - Best case: O(n) when the array is already sorted.
     * - Average case: O(n^2) for random order.
     * 
     * Space complexity: O(1) as it uses a constant amount of additional space.
     *
     * @param array the array to be sorted
     */
    public static void insertionSort(int[] array) {
        int n = array.length; 
        // Time Complexity: O(n^2) in the worst case, O(n) in the best case
        // Space Complexity: O(1) as it uses a constant amount of additional space
        
        // Loop through each element in the array starting from the second element
        for(int i = 1; i < n; i++) // Start from the second element (index 1)
        {
            int key = array[i]; // The current element to be positioned
            int j = i - 1; // Start comparing with the previous element
            
            // Shift elements of the sorted segment to the right to make space for the key
            while(j >= 0 && array[j] > key) {
                array[j + 1] = array[j]; // Move the larger element one position ahead
                j = j - 1; // Move to the previous element
            }
            // Insert the key at its correct position
            array[j + 1] = key; // Place the key in the correct position
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