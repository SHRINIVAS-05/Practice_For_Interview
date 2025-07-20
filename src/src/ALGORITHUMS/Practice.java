package src.ALGORITHUMS;

public class Practice {

	public static void main(String[] args) {

		 char d='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(d);
			}
			System.out.println();
			d++;
		}
		d--;
		for(int i=4-1;i>=1;i--)
		{d--;
			for(int j=1;j<=i;j++)
			{
				System.out.print(d);
			}
			System.out.println();
		}
	}
}
