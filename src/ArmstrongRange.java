import java.util.Scanner;

public class ArmstrongRange
{
	public static int getCount(int num)
	{
		int count=0;
		int rem=0;
		while(num!=0)
		{
			rem=num%10;
			count++;
			num=num/10;
		}
		return count;
	}
	public static int sum(int n, int res)
	{
		int sum=0;
		if(n==0)
		{
			return 0;
		}
		int rem=0;
		while(n!=0)
		{
			rem=n%10;
		int value=(int)Math.pow(rem, res);
		sum=sum+value;
		n=n/10;
		}
		return sum;
	}

	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Armstrong number");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int count=0;
		for(int i=num1;i<=num2;i++)
		{
			int res=ArmstrongRange.getCount(i);
			int sum=ArmstrongRange.sum(i, res);
			if(sum==i)
			{
				System.out.println(i+" is a Armstrong number");
				count++;
			}
		}
		System.out.println("Armstrong count is "+count + "  in the given range "+num1+"to" +num2);

	}

}
