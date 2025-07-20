package src.APNA_COLLEGE;

public class MaximunSubArray {

	public static int MaximumSubarraY(int arr[]) {

		int ActualSum = arr[0];
		int CurSum = arr[0];
		int n = arr.length;

		for (int i = 1; i < n; i++) {
			CurSum = Math.max(arr[i], arr[i] + CurSum);
			ActualSum = Math.max(CurSum, ActualSum);
		}

		return ActualSum;
	}
	
	public static int MaximumSubarraY1(int arr[])
	{
		int n= arr.length;
		int SumSoFor=Integer.MIN_VALUE;
		
		for(int start=0;start<n;start++)
		{
			int currSum=0;
			
			for(int end=start;end<n;end++)
			{
				currSum+=arr[end];
				SumSoFor=Math.max(currSum, SumSoFor);
			}
			System.out.println(currSum);
		}
		return SumSoFor;
	}

	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println("Maximum Subarray Sum: " + MaximumSubarraY1(arr));

	}

}
