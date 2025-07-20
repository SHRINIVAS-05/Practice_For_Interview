package src.LEETCODE_75_ARRAY;

public class MinInRotatedSortedArray {

	public static int findMin(int arr[]) {
		int low = 0;
		int high = arr.length - 1;

		while (low < high) {
			int mid = (low + high) / 2;
			if (arr[mid] > arr[high]) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return arr[low];
	}

	public static void main(String[] args) {

		int[] nums = {3, 4, 5, 1, 2};
        System.out.println("Minimum element is: " + findMin(nums)); // Output: 1
    }

}
