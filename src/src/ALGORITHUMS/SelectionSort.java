package src.ALGORITHUMS;

public class SelectionSort {
	
	 public static void main(String[] args) {
	        int[] numbers = {64, 25, 12, 22, 11};

	        System.out.println("Original Array:");
	        printArray(numbers);

	        selectionSort(numbers);

	        System.out.println("\nSorted Array (Ascending Order):");
	        printArray(numbers);
	    }

	    // 🔹 Selection Sort Algorithm
	    public static void selectionSort(int[] arr) {
	        int n = arr.length;

	        // Move the boundary of unsorted subarray
	        for (int i = 0; i < n - 1; i++) {
	        	
	            int minIndex = i;

	            // Find the index of the minimum element in the remaining array
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }

	            // Swap the found minimum element with the first element
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }
	    }

	    // 🔹 Utility method to print array
	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

}
