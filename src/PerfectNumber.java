import java.util.Scanner;

public class PerfectNumber {
	public int perfect(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		return sum;
		
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		PerfectNumber pf=new PerfectNumber();
		int res=pf.perfect(n);
		if(res==n)
		{
			System.out.println("Given number is perfect number  "+ n);
		}
		else
		{
			System.out.println("Given number is not perfect number  "+ n);

		}

	}

}
