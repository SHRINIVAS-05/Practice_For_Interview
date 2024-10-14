
package MatrixProgram;

import java.util.Scanner;

public class TransposeOfMatrix {

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




	}

}
