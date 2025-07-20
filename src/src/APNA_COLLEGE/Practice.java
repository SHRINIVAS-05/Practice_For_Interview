package src.APNA_COLLEGE;

public class Practice {
	
	public static void printAllSubarrays(String[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				for(int k=i;k<=j;k++)
				{
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		String[] arra = { "apple", "banana", "cherry" };
		System.out.println("All possible subarrays:");
		printAllSubarrays(arra);
	}

}
