package MatrixProgram;

import java.util.Scanner;

public class SymetricMatrix {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int a[][]=new int [3][3];
		int b[][]=new int [3][3];
		// Change colum to row
		
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Elements are");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		
		System.out.println("Transpose Elements");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		boolean flag=true;
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i][j]!=b[i][j])
				{
					flag=false;
					break;
				}
			}
		}
		
		if(flag==true)
		{
			System.out.println("Matrix is Symmetric");
		}
		else
		{
			System.out.println("Matrix is notSymmetric");
		}
/*1
2
3
2
4
5
3
5
6
Elements are
1 2 3 
2 4 5 
3 5 6 
Transpose Elements
1 2 3 
2 4 5 
3 5 6 
Matrix is Symmetric
*/

	}

}
