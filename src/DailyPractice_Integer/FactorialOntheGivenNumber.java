package DailyPractice_Integer;

import java.util.Scanner;

public class FactorialOntheGivenNumber {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number to find out the factorial number");
		int n=scan.nextInt();
		
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		
		System.out.println(fact);

	}

}
