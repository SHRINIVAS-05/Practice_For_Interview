package MatrixProgram;

import java.util.Scanner;

public class SpareMatrix 
{

	public static void main(String[] args) 
	{
		// Spare Matrix means=number of zeros are more than the non zero matrixs
		Scanner scan=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("Enter the elements");
		
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=scan.nextInt();
				if(a[i][j]==0)
				{
					count++;
				}
				
			}
		}
		System.out.println("Enter Elements");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		if(count>(3*3)/2)
		{
			System.out.println("Enter Matrix is Spare");
		}
		else
		{
			System.out.println("Enter Matrix is notSpare");
		}

	}

}
