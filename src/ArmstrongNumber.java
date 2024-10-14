import java.util.Scanner;

public class ArmstrongNumber {
	public static int getcount(int num)
	{
		int count=0;
		int value=0;
		while(num!=0)
		{
			value=num%10;
			count++;
			num=num/10;
			
		}
		return count;
	}
	public static int sum(int num,int res)
	{
		int rem=0;
		int sum=0;
		while(num!=0)
		{
			rem=num%10;
			int value=(int) Math.pow(rem, res);
			num=num/10;
			sum=sum+value;
		}
		return sum;
		
	}


	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		int res=ArmstrongNumber.getcount(num);
		int sum=ArmstrongNumber.sum(num, res);
		if(num==sum)
		{
			System.out.println("Given number is ArmStrong number" + sum);
		}
		else
		{
			System.out.println("Given number is not ArmStrong number"+ sum);
		}


	}

}
