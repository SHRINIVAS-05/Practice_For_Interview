package src.APNA_COLLEGE;

public class AllSubarrays {
	public static void printAllSubarrays(int[] nums) {
		int n = nums.length;
		for (int start = 0; start < n; start++) {
			for (int end = start; end < n; end++) {
				// Print subarray from start to end
				for (int i = start; i <= end; i++) {
					System.out.print(nums[i] + " ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,12,-5,-6,50,3};
		//System.out.println("All possible subarrays:");
		//printAllSubarrays(arr);

		String[] arra = { "apple", "banana", "cherry" };
		System.out.println("All possible subarrays:");
		printAllSubarrays(arra);

	}

	public static void printAllSubarrays(String[] words) {
		int n = words.length;
		for (int start = 0; start < n; start++) {
			for (int end = start; end < n; end++) {
				// Print subarray from start to end
				for (int i = start; i <= end; i++) {
					System.out.print(words[i] + " ");
				}
				System.out.println();
			}
		}
	}

}
