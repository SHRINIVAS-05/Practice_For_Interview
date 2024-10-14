 package MatrixProgram;

import java.util.Scanner;

public class ImpMatrix 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println(a.length-1 +"  <--");
		
		System.out.println("Enter Elements");
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
		System.out.println();
		
		System.out.println("Daigonal elements Are ");
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==j)
				{
					System.out.println(a[i][j]);
					sum=sum+a[i][j];
				}
			}
		}
		System.out.println();
		System.out.println("Sum of Daigonal Elements are---->  "+sum);
		
		
		System.out.println("Opposite Diagonal elements are  ");
		int sum2=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i+j==a.length-1)
				{
					//System.out.println("i--->"+i+"---> j "+j);
					System.out.println(a[i][j]);
					sum2=sum2+a[i][j];
				}
			}
		}
	
		System.out.println("Sum of Opposite Diagonal elements are      "+sum2);
		
		System.out.println("First row elements Are ");
		int sum3=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				
				if(j==0)
				{
					System.out.println(a[i][j]);
					sum3=sum3+a[i][j];
					
				}
				
			}
		}
	
		
	}

}
