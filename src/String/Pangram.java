package String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
	public static boolean panagram(String a)
	{
		Set<Character> charset=new HashSet<>();
		for(char c:a.toCharArray())
		{
			if(Character.isAlphabetic(c))
			{
				charset.add(c);
			}

		}
		
		
		return charset.size()==26;
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String ");
		String sentance1=scan.nextLine();
		String sentance=sentance1.toLowerCase();
		boolean ispa=panagram(sentance);
		System.out.println(ispa+" "+"is panagram");
	}
}
