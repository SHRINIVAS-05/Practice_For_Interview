package src.ALGORITHUMS;

public class InsertionSort {

	public static void main(String[] args) {
		int[] numbers = { 50, 20, 40, 10, 30 };

		System.out.println("Original Array:");
		printArray(numbers);

		insertionSort(numbers);

		System.out.println("\nSorted Array (Ascending Order):");
		printArray(numbers);
	}

	// 🔹 Insertion Sort Algorithm
	public static void insertionSort(int[] arr) {
		int n = arr.length;

		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j --;
			}

			arr[j + 1] = key;
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
