package MatrixProgram;

import java.util.Scanner;

public class ShowingMatrix 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int arr[][]=new int[3][3];
		
		System.out.println("Enter Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
