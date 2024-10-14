import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter range of numbers that you want fatorial number");
	int k=scan.nextInt();
	int n=scan.nextInt();
	int fact=1;
	for(int i=k;i<=n;i++)
	{
		fact=fact*i;
		System.out.println(fact);
		
	}
	}

}
