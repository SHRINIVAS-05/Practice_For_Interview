package src.LEETCODE_75_ARRAY;

public class MaximunSubArrayProduct {

	public static int FindMaximunSubArrayProduct(int arr[]) {

		int n = arr.length;
		int ProdSoFor = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			int CurPord = 1;
			for (int j = i; j < n; j++) {
				CurPord = CurPord * arr[j];
				ProdSoFor = Math.max(CurPord, ProdSoFor);
			}
		}
		return ProdSoFor;
	}

	public static void main(String[] args) {
		int []nums = {-2,0,-1}; //{2,3,-2,4};
		int FindMaProduct=FindMaximunSubArrayProduct(nums);
		System.out.println("Maximum SubArray : "+ FindMaProduct);
	}

}
