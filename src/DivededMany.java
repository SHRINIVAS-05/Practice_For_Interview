import java.util.Scanner;

public class DivededMany {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ans");
		int first=1;
		int a=100;
		while(first<=a)
		{
			if(first%2==0 && first%3==0)
			{
				System.out.println(first+" Answers");
			}
			first++;
		}
		

	}

}
