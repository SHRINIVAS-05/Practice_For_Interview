package Pattern;

public class Pattern5 {

	public static void main(String[] args) 
	{
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			int m=5;
			for(int j=1;j<=n;j++)
			{
				System.out.print(m+" ");
				m--;
			}
			
			System.out.println();
		}

	}

}
