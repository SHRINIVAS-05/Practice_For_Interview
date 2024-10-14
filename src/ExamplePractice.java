import java.util.Arrays;
import java.util.Scanner;

public class ExamplePractice
{
	private int q[];
	private int r=-1;
	private int f=0;
	int count=0;
	private int size;
	private Scanner scan=new Scanner(System.in);
	
	public ExamplePractice(int n)
	{
		q=new int[n];
		size=q.length;
	}
	//
	public void push()
	{
		if(r==size-1)
		{
			System.out.println("push not possible");
		}
		else
		{
		System.out.println("enter elem");
		int elem=scan.nextInt();
		++r;
		q[r]=elem;
		}
	}
	public void deletion()
	{
		if(r==-1||f>r)
		{
			System.out.println("deletion is not possible");
		}
		else
		{

			System.out.println("element is deleted");
			++f;
		}
	}
	public void display()
	{
		if(r==-1||f>r)
		{
			System.out.println("Deletion is not possible");
		}
		else
		{
			for(int i=f;i<=r;i++)
			{
				System.out.println(q[i]);
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array length");
		int n=scan.nextInt();
		ExamplePractice a=new ExamplePractice(n);
		while(true)
		{
			System.out.println("Enter 1 for insertion");
			System.out.println("Enter 2 for delete");
			System.out.println("Enter 3 for display");
			System.out.println("Enter any other number for exiting");
			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			switch(choice)
			{
			case 1:a.push();
			break;
			case 2:a.deletion();
			break;
			case 3:a.display();
			break;
		    default:System.exit(0);
			}


		}

		}
		
		
	}

