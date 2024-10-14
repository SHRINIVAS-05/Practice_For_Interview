import java.util.Scanner;

public class Practice1Armstrong
{
	public static int digits(int n)
	{
		int count=0;
		while(n!=0)
		{
			int m=n%10;
			n=n/10;
			count++;
		}
		return count;
	}
	
	public static int arm(int n,int count)
	{
		int val=0;
		int total=0;
		while(n!=0)
		{
			int m=n%10;
			val=(int) Math.pow(m, count);
			n=n/10;
			total=total+val;
		}
		return total;
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int sum=0;
		int n=scan.nextInt();
		int m=scan.nextInt();
		for(int i=n;i<=m;i++)
		{
		int res=Practice1Armstrong.digits(i);
		int ress=Practice1Armstrong.arm(i, res);
		
		if(i==ress)
		{
			sum++;
			System.out.println(i+"  The given number is Amstrong");
		}
		}
		System.out.println(sum);

	}

}
