package MatrixProgram;

import java.util.Scanner;

public class SumOfTwoMatrix {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int arr[][]=new int[3][3];
		int arr2[][]=new int[3][3];
		int arr3[][]=new int[3][3];

		System.out.println("Enter Elements for first matrix");
		for (int i = 0; i <= arr.length - 1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("Enter Elements for Second matrix");
		for(int i=0;i<=arr2.length-1;i++)
		{
			for(int j=0;j<=arr2.length-1;j++)
			{
				arr2[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<=arr3.length-1;i++)
		{
			for(int j=0;j<=arr3.length-1;j++)
			{
				arr3[i][j]=arr3[i][j]+(arr[i][j]+arr2[i][j]);
			}
		}
		
		for(int i=0;i<=arr3.length-1;i++)
		{
			for(int j=0;j<=arr3.length-1;j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}

}
