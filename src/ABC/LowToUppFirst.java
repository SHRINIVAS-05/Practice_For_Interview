package ABC;

import java.util.Scanner;

public class LowToUppFirst 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String a=scan.nextLine();
		
		char ch[]=a.toCharArray();
		ch[0]=(char) (ch[0]-32);
		for(int i=0;i<=ch.length-1;i++)
		{
			if(ch[i]==' ')
			{
				ch[i+1]=(char) (ch[i+1]-32);
			}
		}
		String s=new String(ch);
		
		System.out.println(a);
		System.out.println(s);
	}

}
