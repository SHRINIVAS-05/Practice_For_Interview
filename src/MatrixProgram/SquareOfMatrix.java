package MatrixProgram;

import java.util.Scanner;

public class SquareOfMatrix 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		
		System.out.println("Enter first Matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("Square of matrix");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				b[i][j]=0;
				for(int k=0;k<b.length;k++)
				{
					b[i][j]=b[i][j]+(a[i][k]*a[k][j]);
				}
			}
		}
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}


	}

}
