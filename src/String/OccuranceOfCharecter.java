package String;

import java.util.Scanner;

public class OccuranceOfCharecter
{
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String str1="welcome to urbanpro welcome to bangalore";
		//String str1="hello hi hoo";
		System.out.println(str1);
		 char arr[]=str1.toCharArray();
		 int newcount=0;
		 char Maxch=' ';
		 for(int i=0;i<=arr.length-1;i++)
		 {
			 int count=1;
			 for(int j=i+1;j<=arr.length-1;j++)
			 {
				 if(arr[i]==arr[j])
				 {
					 count++;
					 arr[j]='0';
				 }
			 }
		 
		/* if(count>1&& arr[i]!='0')
		 {
		 System.out.println(arr[i]+" " +count);
		 }
			*/if(count>newcount&&arr[i]!='0')
			{
				newcount=count;
				Maxch=arr[i];
			}

		 }
		System.out.println(newcount+" Times "+Maxch);
	}

}
