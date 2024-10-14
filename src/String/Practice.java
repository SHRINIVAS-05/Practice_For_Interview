package String;

import java.util.Scanner;

public class Practice {

	public static void main(String [] args)
	{	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String a= scan.nextLine();
		System.out.println("String from original  --> "+a);  // Hashset bin  --> nibtesh saH
		
		char arr[]= a.toCharArray();
		char arr2[]= new char[arr.length];
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==' ')
			{
				arr2[i]=arr[i];
			}
		}
		
		int j=arr2.length-1;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=' ')
			{
				if(arr2[j]==' ')
				{
					j--;
				}
				arr2[j]=arr[i];
				j--;
			}
		}
		String aa= new String(arr2);
		System.out.println(aa);
		
		
		
	}
}
