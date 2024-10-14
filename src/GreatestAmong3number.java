import java.util.Scanner;

public class GreatestAmong3number {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		if(a>b)
		{
			b=a;
		}
		if(b>c)
		{
			c=b;
		}
		System.out.println(c);
	}

}
