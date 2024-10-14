package ABC;

import java.util.Scanner;

public class StringIsEmpty {

	public static void main(String[] args)
	{
		System.out.println("Enter a String ");
		Scanner scan=new Scanner(System.in);
		String a=scan.nextLine();
		
		if(a.length()==0)
		{
			System.out.println("String Empty");
		}
		else
		{
			System.out.println("String is not Empty");
		}

	}

}
