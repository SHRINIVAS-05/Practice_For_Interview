package src.LEETCODE_75_ARRAY;

public class MaximunSubArray {

	public static int FindMaximunSubArray(int arr[]) {
		int n = arr.length;
		int SumSoFor = Integer.MIN_VALUE;
		for (int i = 0; i <n; i++) {
			int CurSum = 0;
			for (int j = i; j < n; j++) {
				CurSum = CurSum+arr[j];
				SumSoFor = Math.max(CurSum, SumSoFor);
			}
		}
		return SumSoFor;
	}

	 public static int maxSubArraySum(int[] nums) {
	        int maxSoFar = nums[0];        // Initialize with the first element
	        int currentMax = nums[0];      // Keeps running sum of current subarray

	        for (int i = 1; i < nums.length; i++) {
	            currentMax = Math.max(nums[i], currentMax + nums[i]);
	            maxSoFar = Math.max(maxSoFar, currentMax);
	        }

	        return maxSoFar;
	    }
	public static void main(String[] args) {
	int []nums = {-2,1,-3,4,-1,2,1,-5,4};
	
	int MaximumSubArray=FindMaximunSubArray(nums);
	System.out.println("Maximum subarray : "+MaximumSubArray);

	}

}
