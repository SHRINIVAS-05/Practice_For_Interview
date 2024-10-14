import java. util.Scanner;

public class PrimeNumberRange
{
	boolean prime(int n)
	{
		if(n==0||n==1)
		{
			return false;
		}
		else if(n==2)
		{
			return true;
		}
		else
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
				return false;
				}
			}
		}
		return true;
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		PrimeNumberRange pr=new PrimeNumberRange();
		for(int i=a;i<b;i++)
		{
			boolean res=pr.prime(i);
			if(res==true)
			{
				System.out.println(i);
			}
		}
		
		
	}

}
