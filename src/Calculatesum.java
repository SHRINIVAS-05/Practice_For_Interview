
import java.util.Scanner;

public class Calculatesum {
	public int calculate(int m,int n)
	{
		int sum=0;
		for(int i=m;i<n;i++)
		{
			if(i%3==0 && i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	
	
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter numbers");
		int m=scan.nextInt();
		int n=scan.nextInt();
		Calculatesum cs=new Calculatesum();
		int res=cs.calculate(m, n);
		System.out.println(res);
		
		
	}

}

