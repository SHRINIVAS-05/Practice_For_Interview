package Pattern;

public class Pattern12 {

	public static void main(String[] args) 
	{
		int n=5;
		int m=1;
		for(int i=1;i<=n;i++)
		{
			int b=i;
			for(int j=1;j<=n;j++)
			{
				System.out.print(b+" ");
				b+=n;
			}
			System.out.println();
		}

	}

}
