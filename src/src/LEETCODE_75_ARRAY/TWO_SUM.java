package src.LEETCODE_75_ARRAY;

public class TWO_SUM {
	
	//QUESTION
	/*
	 * Input: nums = [2,7,11,15], target = 9 Output: [0,1]
	 *  Explanation: Because
	 * nums[0] + nums[1] == 9, we return [0, 1].
	 */
	public static void AddSum(int arr[], int target)
	{
		System.out.print("[");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.print(i+", "+j);
				}
			}
		}
		System.out.print("]");
	}

	public static void main(String[] args) {
		
		int arr[]= {2,7,11,15};
		int target = 9;
		AddSum(arr,target);

	}

}
