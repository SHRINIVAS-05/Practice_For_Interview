package String;

import java.util.Scanner;

public class Palindrome {
	
	public static String palindrom(String str)
	{
		
		char []arr=str.toCharArray();
		char [] arr2=new char[arr.length];
		int j=arr2.length-1;
		for(int i=0;i<=arr.length-1;i++)
		{
			arr2[j]=arr[i];
					j--;
		}
		String str2=new String(arr2);
		return str2 ;
		
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scan.nextLine();
		String str=s.replace(" ","");
		String res=Palindrome.palindrom(str);
		System.out.println(res);
		if(res.equalsIgnoreCase(str))
		{
			System.out.println("The Given String is Palindrome  "+res);
		}
		else
		{
			System.out.println("The Given String is not Palindrome  "+res);
		}

	}

}
