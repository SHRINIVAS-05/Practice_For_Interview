package src.PRACTICE;

public class Practice1 {

	// Starting bubble Sort method
	
	public static void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				// Swap
				if (arr[j] > arr[j + 1]) {
					int help = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = help;

				}
			}
		}

	}
	// Ending bubble Sort method

	// Starting Selection Sort method
	public static void SelectionSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int indx = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[indx]) {
					indx = j;
				}
			}

			int help = arr[indx];
			arr[indx] = arr[i];
			arr[i] = help;
		}
	}
	// Ending Selection Sort method
	
	// Starting Insertion  Sort method
	public static void InsertionSort(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]> key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			
			arr[j+1]=key;
		}
	}
	
	public static void quickSort(int arr[], int start,int end)
	{
		if(start< end)
		{
			int pivot=partition(arr, start, end);
			
			//left Sort
			quickSort(arr, start, pivot-1);
			
			//right Sort
			quickSort(arr, pivot+1,end);
		}
	}
	
	public static int partition(int arr[], int start,int end)
	{
		int indx=start-1;
		int pivot=arr[end];
		
		for(int i=start;i<end;i++)
		{
			if(arr[i]>pivot)
			{
				indx++;
				int help=arr[indx];
				arr[indx]=arr[i];
				arr[i]=help;
			}
		}
		
		int help=arr[indx+1];
		arr[indx+1]=arr[end];
		arr[end]=help;
		return indx+1;
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
		System.out.println(numbers.length);

		System.out.println("Original Array:");
		printArray(numbers);

//		bubbleSort(numbers);
//		System.out.println("\nSorted Array bubble sort (Ascending Order):");
//		printArray(numbers);
//		
//		SelectionSort(numbers);
//		System.out.println("\nSorted Array SelectionSort (Decending Order):");
//		printArray(numbers);
//		
//		InsertionSort(numbers);
//		System.out.println("\nSorted Array InsertionSort (Decending Order):");
//		printArray(numbers);
		
		quickSort(numbers,0,numbers.length-1);
		System.out.println("\nSorted Array QuickSort (Decending Order):");
		printArray(numbers);
	}
}
