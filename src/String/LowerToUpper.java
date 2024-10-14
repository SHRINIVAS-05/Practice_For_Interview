package String;

import java.util.Scanner;

public class LowerToUpper {
	public static String lower(String str)
	{
		char []arr=str.toCharArray();
		arr[0]=(char) (arr[0]-32);
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==' ') {
			arr[i+1]=(char) (arr[i+1]-32);
			
			/*String str=scan.nextLine();
		char arr[]=str.toCharArray();
		char arr2[]=new char[arr.length];
		arr2[0]=(char) (arr[0]-32);
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]==' ')
			{
			arr2[i]=arr[i];
			}
			if(arr2[i]!=' ')
			arr2[i]=(char) (arr[i]-32);
			
		}
		String str2=new String(arr2);
		System.out.println(str2);*/
			}
			
		}
		String str2=new String(arr);
		return str2;
		
	}
	

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Sentance");
		String str=scan.nextLine();
		String res=LowerToUpper.lower(str);
		System.out.println(res);

	}

}

