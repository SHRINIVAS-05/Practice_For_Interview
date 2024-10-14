package String;

import java.util.Scanner;

public class ReverseSentanceSpace {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=scan.nextLine();
		char[]arr=str.toCharArray();
		char[]brr=new char[arr.length];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==' ')
			{
				brr[i]=arr[i];
			}
		}
			int j=brr.length-1;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=' ')
				{
					if(brr[j]==' ')
					{
						j--;
					}
					brr[j]=arr[i];
					j--;
				}
			}
		String ss=new String(brr);
		System.out.println(ss);
		

	}

}
