package String;

import java.util.Scanner;

public class CountVowelsCon {
	public static String count(String str)
	{
		
		char []arr=str.toCharArray();
		int vocount=0;
		int coscount=0;
		int spcount=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>='A'&&arr[i]<='Z')
			{
				if(arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='U'||arr[i]=='O')
				{
					vocount++;
				}
				else
				{
					coscount++;
				}
			}
			else
			{
				spcount++;
			}
		}
//		System.out.println("vowels count "+vocount);
//		System.out.println("cons0nants count "+vocount);
//		System.out.println("special charecters count  "+spcount);
		return vocount+" vowels "+coscount+" consonats  "+" sp "+spcount;
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter String");
		String s=scan.nextLine();
		String str=s.toUpperCase();
		String s1 = CountVowelsCon.count(str);
		System.out.println(s1);

	}

}
