package ABC;

import java.util.Scanner;

public class CheckIntegerOrCharecter {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter ");
		String s=scan.nextLine();
		
		char ch[]=s.toCharArray();
		
		for(int i=0;i<=ch.length-1;i++)
		{
			if(ch[i]>='1'&&ch[i]<='9')
			{
				System.out.println("IntegerString ");
			System.exit(0);
			}
			else 
			{
				System.out.println("Not integer String");
				System.exit(0);
			}
		}
		

	}

}
