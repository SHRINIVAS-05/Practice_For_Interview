package ABC;


public class Practice {

	public static void main(String[] args) 
	{
		String str="TEKFRIDAY PROCESSING PVT LTTD SOLUTIONS";
		System.out.println(str);
		str=str.replace(" ", "");
		
		char arr[]=str.toCharArray();
		int Max=0;
		int Min=0;
		char ch=' ';
		char ch2=' ';

		for(int i=0;i<=arr.length-1;i++) 
		{
			int count=1;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					
					count++;
				}
			}
			if(arr[i]!='0')
			{
				System.out.println(arr[i]+"  "+ count);
			}
			if(count>1)
			{
			if(count>Max)
			{
				Min=Max;
				ch=arr[i];
				Max=count;
				ch2=arr[i];

				
			}
			else if(Max> count  && Min< count)
			{
				Min=count;
				ch=arr[i];
			}
			}
		}
		
		System.out.println("SecMax " + ch + " Count "+ Min);
		System.out.println("SecMax " + ch2 + " Count "+ Max);

		
	}
}
