package MatrixProgram;

import java.util.Scanner;

public class MaltiplicationOfMatrix 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length");
		int n=scan.nextInt();
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		int c[][]=new int[n][n];
		
		System.out.println("enter first Matrix Elements");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("enter second Matrix Elements");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				b[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Sum of Matrix Elements");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				c[i][j]=0;
				for(int k=0;k<c.length;k++)
				{
					c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
				}
				
			}
		}
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}


	}

}
