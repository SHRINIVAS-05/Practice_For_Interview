 import java.util.Scanner;

public class FibanociNumberRange {
	
	/*public int fib(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		return (n-2)+(n-1);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		FibanociNumberRange fb=new FibanociNumberRange();
		int res=fb.fib(n);
		System.out.println(res);*/



	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the limit:");
	        int n = scan.nextInt();
	        
	        int a = 0, b = 1, c;
	        System.out.println("Fibonacci Series up to " + n + ":");
	        System.out.print(a + " " + b + " "); // Printing the first two elements
	        
	        for (int i = 2; i < n; i++) {
	            c = a + b;
	            if (c <= n) {
	                System.out.print(c + " "); // Printing the Fibonacci number
	                a = b;
	                b = c;
	            } else {
	                break; // Exit the loop if the next Fibonacci number exceeds the limit
	            }
	        }
	    }
	}



