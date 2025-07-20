package src.ALGORITHUMS;

public class BubbleSort {
	
    public static void main(String[] args) {
    	
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        printArray(numbers);

        bubbleSort(numbers);

        System.out.println("\nSorted Array (Ascending):");
        printArray(numbers);
    }

    // 🔹 Bubble Sort algorithm
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        for(int i=0; i<n-1; i++)
        {
        	for(int j=0;j<n-1-i;j++)
        	{
        		if(arr[j] > arr[j+1])
        		{
        			int help=arr[j];
        			arr[j]=arr[j+1];
        			arr[j+1]=help;
        		}
        	}
        }
    }

    // 🔹 Helper method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
