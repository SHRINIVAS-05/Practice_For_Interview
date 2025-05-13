package DailyPractice_Integer;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void Fibonacciseries(int n)
	{
		int first=0,second=1,next;
		for(int i=0;i<n;i++)
		{
			System.out.print(first+" ");
			next=first+second;
			first=second;
			second=next;
		}
	}

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number to print the Fibonacciseries");
		int n=scan.nextInt();
		Fibonacciseries(n);
	}

}
