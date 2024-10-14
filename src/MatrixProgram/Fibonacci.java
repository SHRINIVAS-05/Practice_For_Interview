package MatrixProgram;

import java.util.Scanner;

public class Fibonacci 
{
	public static void fibo(int n)
	{
		int first=0;
		int second=1;
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(first+" ");
			
			int nextint=first+second;
			first=second;
			second=nextint;
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scan.nextInt();
		fibo(n);
		
	}

}
