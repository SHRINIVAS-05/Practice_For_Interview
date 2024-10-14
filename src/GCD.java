import java.util.Scanner;

public class GCD
{
	public int gcd(int m ,int n)
	{
		while(n!=0)
		{
		int rem=m%n;
		m=n;
		n=rem;
		}
		return m;
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
		int m=scan.nextInt();
		int n=scan.nextInt();
		GCD g=new GCD();
		int res=g.gcd(n,m);
		System.out.println(res);

	}

}
