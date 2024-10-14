package Pattern;

public class Pattern7 {

	public static void main(String[] args) 
	{
		int n=5;
		int m=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(m+" ");
				m+=2;
			}
			System.out.println();
		}

	}

}
