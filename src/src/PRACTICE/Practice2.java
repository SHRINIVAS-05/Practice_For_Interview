package src.PRACTICE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice2 {
	
	
	public static void quicksort(int arr[], int start, int end)
	{
		while(start< end)
		{
			int pivot=partition(arr, start, end);
			
			quicksort(arr, start, pivot+1);
			
			quicksort(arr, pivot-1, end);
		}
	}
	
	public static int partition(int arr[],int start,int end)
	{
		int pivot=arr[end];
		int indx=start-1;
		return end;
	}

	public static void main(String[] args) {
		

	}

}
