package String;

import java.util.Scanner;

public class CountEachWord{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String a="om vish shri ro om ro kun kun om ro vish";
		
		/*3 Times om
		2 Times vish
		3 Times ro
		2 Times kun*/

		
		String []sentance=a.split(" ");
		
		for (int i = 0; i < sentance.length; i++) 
			
		{
			int count=1;
			for (int j =i+1; j < sentance.length; j++) 
			{
				if(sentance[i].equals(sentance[j]))
				{
					count++;
					sentance[j]="0";
				}
			}
			if(count>1&&sentance[i]!="0")
			{
				System.out.println(count+" Times "+sentance[i]);
			}
		}
		
		
		
	}

		
		
		
		
		
		
		
		
		/*String input="om vish shri ro om ro kun kun om ro vish";
		String word[]=input.split(" ");
	  //  int wordlen=word.length;
	    	for(int i=0;i<word.length-1;i++) {
	    		String words=word[i];
	    	int	count=1;
	    	for(int j=i+1;j<word.length;j++) {
	    		if(words.equals(word[i])) {
	    			count++;
	    			for (int j2 = 0; j2 < word.length-1; j2++) {
						word[j2]=word[j2+1];
					}
	    		// 	wordlen--;
	    			j--;
	    		}
	    	}
	    
	    		System.out.println(words+" occurs "+count);
	    	}
	    	} */
	}
