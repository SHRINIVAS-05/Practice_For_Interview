package src.ALGORITHUMS;

public class QuickSort {

	public static void quickSort(int arr[], int start, int end) {

		if (start < end) {
			int pivot = partition(arr, start, end);

			quickSort(arr, start, pivot - 1); // Left sort
			quickSort(arr, pivot + 1, end); // Right sort
		}
	}

	public static int partition(int arr[], int start, int end) {
		int pivot = arr[end];
		int index = start - 1;

		for (int i = start; i < end; i++) {
			if (arr[i] < pivot) { // For ascending order
				index++;
				// Swap array[index] and array[i]
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}

		// Swap arr[index + 1] and arr[end] (pivot)
		int temp = arr[index + 1];
		arr[index + 1] = arr[end];
		arr[end] = temp;

		return index + 1;
	}

	// 🔹 Utility method to print array
	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] numbers = { 45, 20, 90, 10, 60, 30 };

		System.out.println("Original Array:");
		printArray(numbers);

		quickSort(numbers, 0, numbers.length - 1);

		System.out.println("\nSorted Array (Ascending Order):");
		printArray(numbers);
	}
}
