package src.ALGORITHUMS;

public class BinarySearch {

	public static void SearchKey(int arr[], int key) {
		int low = 0;
		int high = arr.length-1;

		while (low <=high) {
			int mid = (low + high) / 2;
			
				if (arr[mid] == key) {
					System.out.println("Key found @ index :" + mid);
					return;
				} else if (arr[mid] < key) {
					low = mid + 1;
					high = high;
				} else {
					high = mid - 1;
					low = low;
				}
			
		}

		System.out.println("Key not found ");
	}

	public static void main(String[] args) {

		int arr[] = { 1, 4, 6, 9, 10 };
		int Key = 10;
		SearchKey(arr, Key);

	}

}
