import java.util.Scanner;

public class Strong {

	public int fact(int n)											
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public boolean strong(int num)
	{
		int temp=num;
		int sum=0;
		int digit=0;
		while(temp!=0)
		{
			digit=temp%10;
			sum=sum+fact(digit);
			temp=temp/10;
		}
		if(sum==num)
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
		System.out.println("Enter a Number to check whether the Given number is Strong or not");
		int n= scan.nextInt();
		Strong s=new Strong();
		boolean res=s.strong(n);
		if(res==true)
		{
			System.out.println("Given number is Strong number   "+n);
		}
		else
		{
			System.out.println("Given number is not a Strong number   "+n);

		}

	}

}
