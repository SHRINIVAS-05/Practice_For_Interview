
public class Digit3Unique {

	public static void main(String[] args)
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				for(int k=1;k<=4;k++)
				{
					if(k!=i && k!=j && i!=j)
					{
						System.out.println(i+""+j+""+k);
					}
				}
			}
		}

	}

}
