
public class RotateString {
	
	public static String rotate(String a,int flag)
	{
		char ch[]=a.toCharArray();
		char ch1[]=new char[ch.length];
		if(flag<0)
		{
			for (int i = 0; i < ch.length; i++)
			{
				
				
			}
			String str=new String(ch1);
			return str;
		}
		
		else
		{
			return a;
		}
		
		
		
	}

	
	
	
	public static void main(String[] args)
	{
		
		String a="Easy";
		int flag=-1;
		String res=RotateString.rotate(a, flag);
		System.out.println(res);

	}

}
