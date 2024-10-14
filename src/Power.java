import java.util.Scanner;

public class Power {
	
	public int pow(int n,int m)
	{
		int pow=1;
		for(int i=1;i<=n;i++)
		{
			pow=(int) Math.pow(i, m);
		}
		return pow;
		
	}

	public static void main(String[] args)
	{
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the base");
		int base=scan.nextInt();
		System.out.println("Enter the exponent");
		int exp=scan.nextInt();
		
		//int d=(int) Math.pow(base, exp);
		//System.out.println(d);
		
		Power p=new Power();
		int res=p.pow(base, exp);
		System.out.println(res);

	}

}
