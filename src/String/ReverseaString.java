package String;

import java.util.Scanner;

public class ReverseaString {
	public static String reverse(String str)
	{
		char arr[]=str.toCharArray();
		char arr2[]=new char[arr.length];
		int j=arr2.length-1;
		for (int i=0;i<=arr.length-1;i++) 
		{
			arr2[j]=arr[i];
			j--;
		}
		
		String str2=new String(arr2);
		return str2;
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter A String ");
		String str=scan.nextLine();
		System.out.println("Before reversing String "+str);
		String res=ReverseaString.reverse(str);
		System.out.println("After Reversing String  " +res);

	}

}
