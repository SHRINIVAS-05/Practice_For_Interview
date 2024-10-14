import java.util.Scanner;

public class Palindrome {
	public static boolean palindrome(int n)
	{
		int rem=0;
		int rev=0;
		int copy=n;
		while(n!=0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(copy==rev)
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		Palindrome p=new Palindrome();
		boolean res=p.palindrome(n);
		System.out.println(res);

	}

}
