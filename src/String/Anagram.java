package String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static boolean anagram(String str,String str2)
	{
		str.toLowerCase();
		str2.toLowerCase();
		str.replace(" ", "");
		str2.replace(" ", "");
		char arr[]=str.toCharArray();
		char arr1[]=str2.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr1);
		if(Arrays.equals(arr, arr1))
		{
			return true;
		}
		else
		{
			return false;
		}

		
	}

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String");
		String str=scan.nextLine();
		String str2=scan.nextLine();

		boolean res= Anagram.anagram(str, str2);
		if(res==true)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("not Anagram");
		}

	}

}
