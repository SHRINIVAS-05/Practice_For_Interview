package MatrixProgram;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=3;
		int a[][]=new int[n][n];
		int b[][]= new int[n][n];
		
		System.out.println("Enter elements for 1st Matrix");

		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a.length-1;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Enter Elements for second matrix");

		for(int i=0;i<=b.length-1;i++)
		{
			for(int j=0;j<=b.length-1;j++)
			{
				b[i][j]=scan.nextInt();
			}
		}
		System.out.println(" First Matrix Elements are");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a.length-1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(" Second Matrix Elements are");
		for(int i=0;i<=b.length-1;i++)
		{
			for(int j=0;j<=b.length-1;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

		// Matrix Multiplication
		
		
	}

}
