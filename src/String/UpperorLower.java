package String;

import java.util.Scanner;

public class UpperorLower {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		 char ch = scan.nextLine().charAt(0);
		 
		 if(ch>'A'&& ch<='Z')
		 {
			 System.out.println("Is upper case");
		 }
		 else
		 {
			 System.out.println("Lower case");
		 }
	}

}
