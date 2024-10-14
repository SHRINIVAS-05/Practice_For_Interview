package String;

import java.util.Scanner;

public class ReverseSentance {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Sentance");  
		String a=scan.nextLine();
		String arr[]=a.split(" ");
		
		String senatnce="";
		for(int i=arr.length-1;i>=0;i--)
		{
			String word="";
			word+=arr[i];
			String m="";
			for(int j=0;j<=word.length()-1;j++)
			{
				m=m+word.charAt(j);
			}
			senatnce=senatnce+m+" ";
		}
		System.out.println(senatnce);
	}

}
