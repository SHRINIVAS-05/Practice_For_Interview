package Alpha;

import java.util.Scanner;

public class FirstLetterUpperCase {
	
	public static String uppercase(String sb)
	{
		StringBuffer sbr=new StringBuffer("");
		char ch=Character.toUpperCase(sb.charAt(0));
		sbr.append(ch);
		
		for(int i=1;i<sb.length();i++)
		{
			if(sb.charAt(i)==' ' && i<sb.length()-1)
			{
				sbr.append(sb.charAt(i));
				i++;
				sbr.append(Character.toUpperCase(sb.charAt(i)));
			}
			else
			{
				sbr.append(sb.charAt(i));
			}
		}
		return sbr.toString();
	
	}
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Sentance");
		String str=scan.nextLine();
		String s=uppercase(str);
		System.out.println(s);
		
		
		
	}

}
