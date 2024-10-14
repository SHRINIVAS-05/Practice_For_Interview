package ABC;

import java.util.Scanner;

public class MostOccuranceCharacter {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your String");
		String str = scan.next();
		char arr[] = str.toCharArray();
		int MostOccuranceNumber=0;
		int SecondMostOccuranceNumber=0;
		char MostOccuranceChar=' ';
		char SecondMostOccurancechar=' ';
		for (int i = 0; i <= arr.length - 1; i++) 
		{
			int count = 1;
			for (int j = i + 1; j <= arr.length - 1; j++) 
			{
				if (arr[i] == arr[j])
				{
					count++;
				}
			}
			
			if(count> 1)
			{
				if(count>MostOccuranceNumber)
				{
					
					SecondMostOccuranceNumber=MostOccuranceNumber;
					SecondMostOccurancechar=MostOccuranceChar;
					MostOccuranceNumber=count;
					MostOccuranceChar=arr[i];
				}
				else if(count> SecondMostOccuranceNumber)
				{
					SecondMostOccuranceNumber=count;
					SecondMostOccurancechar=arr[i];
					
				}
			}
			
		}
		System.out.println(MostOccuranceChar+" Times "+ MostOccuranceNumber);
		System.out.println(SecondMostOccurancechar+" Times "+ SecondMostOccuranceNumber);
			

	}

}
