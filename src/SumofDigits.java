import java.util.Scanner;

public class SumofDigits {
	public int summ(int n)
	{
		int rem=0;
		int sum=0;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
		
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		SumofDigits sm=new SumofDigits();
		int res=sm.summ(n);
		System.out.println(res);

	}

}
