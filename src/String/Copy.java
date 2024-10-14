package String;

import java.util.Scanner;

public class Copy {
	
	public static String copy(String arr)
	{
		char str[]=arr.toCharArray();
		char str2[]=new char[str.length];
		for(int i=0;i<=str.length-1;i++)
		{
			str2[i]=str[i];
		}
		String arr2=new String(str2);
		return arr2;
		
	}

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String ");
		String arr=scan.nextLine();
		String res=Copy.copy(arr);
		System.out.println(res);

	}

}
