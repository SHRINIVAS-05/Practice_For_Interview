package String;

import java.util.Scanner;

public class Practice2 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String");
		String a=scan.next();
		a=a.replaceAll(",", " ");
		System.out.println(a);
		
	}

}
