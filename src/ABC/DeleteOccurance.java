package ABC;

public class DeleteOccurance {

	public static void main(String[] args) {
		String s = "SPIDERSLIES";
		char[] ch = s.toCharArray();
		String v = "";
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					ch[j] = '0';
				}

			}

			if (ch[i] != '0') {
				System.out.println(ch[i]);
			}

		}
		
		/*
		StringBuilder arr2=new StringBuilder();
		
		for(int i=0; i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]='0';
					
				}
			}
			if(arr[i]!='0')
			{
				arr2.append(arr[i]);
			}
			
		}
		System.out.println(arr2);*/

	}

}
